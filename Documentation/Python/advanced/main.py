import logging
logging.basicConfig(level = logging.DEBUG, format = "%(asctime)s - %(name)s - %(levelname)s - %(message)s",
                    datefmt = "%m/%d/%Y %H:%M:%S")

import helper

logging.debug("This is a debug message")
logging.info("This is an info message")
logging.warning("This is a warning message")
logging.error("This is an error message")
logging.critical("This is a critical message")

logger = logging.getLogger(__name__)

# create handler
stream_h = logging.StreamHandler()
file_h = logging.FileHandler("file.log")

# level and format
stream_h.setLevel(logging.WARNING)
file_h.setLevel(logging.ERROR)

stream_f = logging.Formatter("%(name)s - %(levelname)s - %(message)s")

formatter = logging.Formatter("%(name)s - %(levelname)s - %(message)s")
stream_h.setFormatter(formatter)
file_h.setFormatter(formatter)

logger.addHandler(stream_h)
logger.addHandler(file_h)

logger.warning("This is a warning")
logger.error("This is an error")

# import logging.config

# logging.config.fileConfig("logging.conf")

# logger = logging.getLogger("simpleExample")
# logger.debug("This is a debug message")

# import logging

# try:
#     a = [1, 2, 3]
#     val = a[4]
# except IndexError as e:
#     logging.error(e, exc_info = True)


# import traceback
# try:
#     a = [1, 2, 3]
#     val = a[4]
# except:
#     logging.error("The error is %s", traceback.format_exc())

# from logging.handlers import RotatingFileHandler

# logger = logging.getLogger(__name__)
# logger.setLevel(logging.INFO)

# handler = RotatingFileHandler("app.log", maxBytes = 2000, backupCount = 5)
# logger.addHandler(handler)

# for _ in range(10000):
#     logger.info("Hello World")


import logging
from logging.handlers import TimedRotatingFileHandler
import time

logger = logging.getLogger(__name__)
logger.setLevel(logging.INFO)

handler = TimedRotatingFileHandler('timed_test.log', when = 's', interval = 5, backupCount=5)
logger.addHandler(handler)

for _ in range(6):
    logger.info("Hello World")
    time.sleep(5)
