# ***Django***

## **Installation**

1. Install Python3
2. Install pip3
3. (If you want to use a database)
```bash
sudo apt-get install libpq-dev # install libpq-dev 

sudo apt-get install python3-psycopg2 #installs the library for postgre-sql
```
4. *Recommended*

Create an environment
```bash
python3 -m pip install --user --upgrade pip

python3 -m pip --version

python3 -m pip install --user virtualenv

python3 -m venv <name of environment> # create an environment

source env/bin/activate # activate the environment

deactive # to deactivate it
```

5. Install Django
```bash
python -m pip install Django
```

---

## **Syntax**

## *Part 1*
```bash
python -m django --version # check if django is installed
```

### **Creating a Project**

1. **cd** into desired directory

2. create initial project
```bash
django-admin startproject mysite # creates a mysite directory in your current directory
```

3. Looking at what was created

- **manage.py**: commmand-line utility that allows you to interact with Django project

- **mysite/__init__.py**: empty file that tells Python that this directory is considered a python project

- **mysite/settings.py**: config for django

- **mysite/urls.py**: url declarations for project

- **mysite/asgi.py**: entry-point for ASGI-compatible web serverse

- **mysite/wsgi.py**: entry-point for WSGI-compatible web servers

### **The Development Server**

1. Verify that django project works
```bash
python manage.py runserver # starts the development server
```
- your expected output should be: 
```
Performing system checks...

System check identified no issues (0 silenced).

You have unapplied migrations; your app may not work properly until they are applied.
Run 'python manage.py migrate' to apply them.

February 08, 2023 - 15:50:53
Django version 4.1, using settings 'mysite.settings'
Starting development server at http://127.0.0.1:8000/
Quit the server with CONTROL-C.
```
- check if your server is running by visiting [http://127.0.0.1:8000](http://127.0.0.1:8000) and you should see a congratulations

- Additional Actions
```bash
python manage.py runserver 8080 # change the port

python manage.py runserver 0.0.0.0:8000 # change the ip address

```

### **Creating the Polls App**

1. Create the application 
```
python manage.py startapp polls
```
### **Write your First View**

1. put the following python code in your **polls/views.py**
```python
from django.http import HttpResponse

def index(request):
    return HttpResponse("Hello, world. You're at the polls index.")
```

### **Write your First View**
1. In **polls/views.py** insert the code

```python
from django.http import HttpResponse

def index(request):
    return HttpResponse("Hello, world. You're at the polls index.)
```

2. create a file **urls.py** in **polls** directory and inser the code
```python
from django.urls import path

from . import views

urlpatterns = [
    path('', views.index, name = 'index')
]
```

3. include the import statement and a url in **mysite/urls.py**; it should look like this
```python
from django.contrib import admin
from django.urls import include, path

urlpatterns = [
    path('polls/', include('polls/urls')),
    path('admin/', admin.site.urls),
]
```

- **include()** allows you to reference other URLconfs
- do not use **include()** for admin.site.urls

4. Run the server
```bash
python3 manage.py runserver
```

5. double check if it works by going to (http://localhost:8000/polls/)[http://localhost:8000/polls/]


## *Part 2*

### **Database Setup**

1. open up **mysite/settings.py**

2. *Assuming you want to use a different database*
- change *ENGINE* to your respective database
- change *NAME* for the name of the database

3. Add additional settings such as *USER*, *PASSWORD*, and *HOST*


### **Creating Models**

- **model**: single, definitive source of information about your data

1. Create two models **Question** and **Choice** by editing **polls/model.py** to look like this
```python
from django.db import models

class Question(models.Model):
    question_text = models.CharField(max_length = 200)
    pub_date = models.DateTimeField('date published')

class Choice(models.Model):
    question = models.ForeignKey(Question, on_delete = models.CASCADE)
    choice_text = models.CharField(max_length = 200)
    votes = models.IntegerField(default = 0)
```

### **Activating Models**

1. Add reference to configuration class in the  **INSTALLED_APPS** settings. Make the **mysite/settigns.py** to look like this
```python
INSTALLED_APPS = [
    'polls.apps.PollsConfig',
    'django.contrib.admin',
    'django.contrib.auth',
    'django.contrib.contenttypes',
    'django.contrib.sessions',
    'django.contrib.messages',
    'django.contrib.staticfiles',
]
```

2. Tell Django that you have made changes to the model
```bash
python manage.py makemigrations polls
```

3. Run the following command
```python manage.py sqlmigrate polls 0001```

- your output should be similar to the following
```
BEGIN;
--
-- Create model Question
--
CREATE TABLE "polls_question" (
    "id" bigint NOT NULL PRIMARY KEY GENERATED BY DEFAULT AS IDENTITY,
    "question_text" varchar(200) NOT NULL,
    "pub_date" timestamp with time zone NOT NULL
);
--
-- Create model Choice
--
CREATE TABLE "polls_choice" (
    "id" bigint NOT NULL PRIMARY KEY GENERATED BY DEFAULT AS IDENTITY,
    "choice_text" varchar(200) NOT NULL,
    "votes" integer NOT NULL,
    "question_id" bigint NOT NULL
);
ALTER TABLE "polls_choice"
  ADD CONSTRAINT "polls_choice_question_id_c5b4b260_fk_polls_question_id"
    FOREIGN KEY ("question_id")
    REFERENCES "polls_question" ("id")
    DEFERRABLE INITIALLY DEFERRED;
CREATE INDEX "polls_choice_question_id_c5b4b260" ON "polls_choice" ("question_id");

COMMIT;
```

#### **Steps for Model Changes**:
1. change your model
2. run **python3 manage.py makemigrations** to create migrations
3. run **python3 manage.py migrate** to apply changes

### **Playing with the API**
---


## **Resources**
[Python Environment](https://packaging.python.org/guides/installing-using-pip-and-virtual-environments/)

[Django Tutorial](https://docs.djangoproject.com/en/4.1/intro/tutorial01/)

[ModelForms Tutorial](https://docs.djangoproject.com/en/4.1/topics/forms/modelforms/)

