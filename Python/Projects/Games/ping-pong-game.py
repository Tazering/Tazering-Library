import turtle as t
import random

playerAScore = 0;
playerBScore = 0;

# create a window and declare a variable called window and call the screen()
window = t.Screen()
window.title("The Ping Pong Game")
window.bgcolor("green")
window.setup(width = 800, height = 600)
window.tracer(0)
ball_dx = 0

# Create the Left Paddle
leftPaddle = t.Turtle()
leftPaddle.speed(0)
leftPaddle.shape("square")
leftPaddle.color("black")
leftPaddle.shapesize(stretch_wid=5, stretch_len=1)
leftPaddle.penup()
leftPaddle.goto(-350, 0)

# Create the Right Paddle
rightPaddle = t.Turtle()
rightPaddle.speed(0)
rightPaddle.shape("square")
rightPaddle.color("white")
rightPaddle.shapesize(stretch_wid=5, stretch_len=1)
rightPaddle.penup()
rightPaddle.goto(350, 0)

# Create the Ball
ball = t.Turtle()
ball.speed(0)
ball.shape("circle")
ball.color("red")
ball.penup()
ball.goto(5, 5)
ballXDirection = 0.2
ballYDirection = 0.2

# code for creating pen for scorecard update
pen = t.Turtle()
pen.speed(0)
pen.color("Blue")
pen.penup()
pen.hideturtle()
pen.goto(0, 260)
pen.write("score", align = "center", font = ('Times New Roman', 24, 'normal'))

# code for moving the left paddle
def leftPaddleUp():
    y = leftPaddle.ycor()
    y = y + 90
    leftPaddle.sety(y)

def leftPaddleDown():
    y = leftPaddle.ycor()
    y = y + 90
    leftPaddle.sety(y)

def rightPaddleUp():
    y = rightPaddle.ycor()
    y = y + 90
    rightPaddle.sety(y)

def rightPaddleDown():
    y = rightPaddle.ycor()
    y = y + 90
    rightPaddle.sety(y)

window.listen()
window.onkeypress(leftPaddleUp, 'w')
window.onkeypress(leftPaddleDown, 's')
window.onkeypress(rightPaddleUp, 'Up')
window.onkeypress(rightPaddleDown, 'Down')

while True:
    window.update()

    ball.setx(ball.xcor() + ballXDirection)
    ball.sety(ball.ycor() + ballYDirection)

    if ball.ycor() > 290:
        ball.sety(290)
        ballYDirection = ballYDirection * -1
    if ball.ycor() < -290:
        ball.sety(-290)
        ballYDirection = ballYDirection * -1

    if ball.xcor() > 390:
        ball.goto(0, 0)
        ball_dx = ball_dx * -1
        playerAScore += 1
        pen.clear()
        pen.write("Player A: {}                 Player B: {} ".format(playerAScore, playerAScore), align = "center", font = ('Monaco', 24, "normal"))


    if(ball.xcor()) < -390:
        ball.goto(0, 0)
        ball_dx = ball_dx * -1
        playerBScore += 1
        pen.clear()
        pen.write("Player A: {}                 Player B: {} ".format(playerAScore, playerAScore), align = "center", font = ('Monaco', 24, "normal"))
    
    if(ball.xcor() > 340) and (ball.xcor() < 350) and (ball.ycor() < rightPaddle.ycor() + 40 and ball.ycor() > rightPaddle.ycor() - 40):
        ball.setx(340)
        ball_dx += -1
    
    if(ball.xcor() < -340) and (ball.xcor() > -350) and (ball.ycor() < leftPaddle.ycor() + 40 and ball.ycor() > leftPaddle.ycor() - 40):
        ball.setx(-340)
        ball_dx = ball_dx * -1
