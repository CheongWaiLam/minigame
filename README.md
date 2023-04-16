# minigame
## Graphical Abstract 
1. User Interface(UI)
![](https://raw.githubusercontent.com/Poole0/minigame/main/home.png?token=GHSAT0AAAAAACBORI7T263FSMT23L3I3Q4IZB3KGLQ)

2. Timber-dog game page
![](https://raw.githubusercontent.com/Poole0/minigame/main/timberdog.png?token=GHSAT0AAAAAACBORI7TB2LXOEQSMXHNHDM2ZB3KGWQ)

3. Pinball-chameleon game page
![](https://github.com/Poole0/minigame/blob/main/pinball.png)

4. Credit page
![](https://raw.githubusercontent.com/Poole0/minigame/main/credit.png?token=GHSAT0AAAAAACBORI7S3ZMUHD6QOZAO3Q2YZB3KHLQ)

## Purpose
Software development process applied: **Ａgile process.**

Reason of choose Agile process

  Agile is suitable for the situation where the requirements are not clear, because we a redoing software development for the first time, and the requirements are not very clear, so we need to gradually clarify the requirements in the process of continuous iteration.  Agile communication is usually much higher, and at the same time it is more flexible, requiring changes at almost any time. 
  
  With Waterfall, it is not easy to define the requirements clearly in the early stage, and the hypothetical requirements based on the early plans may have great risks.  Also, many communications in waterfall are one-way communication in the early stage, and the later projects are very different from the original expectations. 
  
Usage of our software: **entertainment**

## Software development plan
- ### Development process
  Game mechanics >  Character design(chameleon and dog)  > Games rule >User Interface (UI) > Game code > Game testing and modification > Credit 
  
  
  We start by planning the main goals of the game, game mechanics, game style and technical requirements. 
  1. **Main goals**
  
     Timber-dog game: Controlling the dog eats the big bone and watch out for overhanging wooden bars. 

     Pinball-chameleon game: Controlling the chameleon to catch the balls falling from aboded. 

  2. **Game mechanics**
  
     Timber-dog game: In the game, the wooden sticks will continue to fall towards the player, and you need to keep avoiding the wooden sticks, The player with the highest score wins. 

     Pinball-chameleon game: In the game, the ball will continue to fall, and the player needs to keep holding the ball. The player with the highest score wins. 
     
  3. **Game style**
  
  4. **Character design and game scenarios**

  5. **Testing and modification**
  
     We are following three page to test. 
     
     In the homepage, we need to test the pixel images which can make a suitable size to put on the buttons and labels. Then we need to test all the buttons can work normally. When the player presses it, can he switch to other pages or not. 

     In the game pages, we test our games, is it incorrect, undesirable or does not conform to its specification. 

     In the credit page, we need to test the labels, are they in the correct position or not.   

- ### Member
   Four members conduct game production, game design and game testing. Here are the member’s roles, responsibilities and portion.
  1. **Tommy**: Game artist, who working to turn sketches into the pixel style image such as animals character, objects in the game, game background, and the game logo. Also, creating the scene and different viewport.
  2. **Sam**: Game tester, who testing on a game by playing it multiple times to ensure it is player-friendly and runs smoothly. Then he report any bugs to the team and offer feedback to game programmer to make the instructions clearer and overall game experience more enjoyable.
  3. **Leon**: Pinball-chameleon game programmer, who creating Pinball-chameleon game rules, goals and challenges, developing gaming software, incorporating artwork into the game and configuring how players will access and interact with the game.
  4. **Kiki**: Timber-dog game programmer, who creating timber-dog game rules, goals and challenges, developing gaming software, incorporating artwork into the game and configuring how players will access and interact with the game.

- ### Schedule
  We have planned a month schedule to develop this software.
  
  In the first week, we are going to figure it out what fuctions in this software. We want two games in this software, then we want a home page to let the player choose these two games, finally we want a credit page to show our produce list. 
  
  In the second week, we are going to design our game style. Our game style we want to use pxiel style to design it, then one member to design our characters, blackgrounds, buttons, labels, credit page and home page. Also, the other two members need to develop two games(Timber-dog, Pinball-chameleon) separately. When they are developing two games, they design to work in Javafx.  
  
  In the third week, we have the last member is going to test our software. If there are errors in the above tests, member will  tell the go back to design and develop it. 
  
  In the last week, we are going to do a evaluation, write our README.md and record our demo. 
  
  In the evaluation, here are some questions to evaluate.  
  1. How long are the meetings? 
  2. How many issues are discussed during the meetings? 
  3. How often is build made for testing? 
  4. How many bugs in our software? 
  5. How many times will a test member usually test a feature in our software? 

- ### Algorithm

- ### Current statis of our software
Completed the expected user interface (UI), homepage, credit page and two minigames(Timber-dog, Pinball-chameleon).

- ### Future plan
Our future plan is we want to create a table of ranking which can record the scores of all players and then make a competition in these two minigames. Then we will add two more minigames such as flappy bird and Pac-man. 

## Demo
https://youtu.be/8R8uHFOMgDY

## Environment of the software development and running
- ### Programming language: Javafx 
- ### Software Requirnment:  
 1. Language – Javafx  
 2. IDE – Eclipse 
 3. OS – Windows 10
- ### Hardware Requirnment 
 1. Processor – Intel(R) Core i3-5015U  
 2. CPU RAM – 4 GB  
 3. Hard disk – 1 TB 
- ### Require package  (List by class) 
 1. Main 
    - javafx.application.Application; 
    - javafx.scene.Scene; 
    - javafx.scene.image.Image; 
    - javafx.scene.image.ImageView; 
    - javafx.scene.paint.Color; 
    - javafx.scene.text.Font; 
    - javafx.scene.text.Text; 
    - javafx.scene.control.Button; 
    - javafx.scene.control.Control; 
    - javafx.scene.control.Label; 
    - javafx.scene.Group; 
    - javafx.stage.Stage;
   
 2. Timberdog 
    - java.util.ArrayList; 
    - java.util.Random; 
    - javafx.scene.Parent; 
    - javafx.scene.control.Button; 
    - javafx.scene.image.Image; 
    - javafx.scene.image.ImageView;
    - javafx.scene.input.KeyCode; 
    - javafx.scene.layout.Pane; 
    - javafx.scene.text.Text;
  
 3. Pin_ball 
    - java.util.ArrayList; 
    - javax.swing.JOptionPane; 
    - javafx.scene.Parent; 
    - javafx.scene.control.Button; 
    - javafx.scene.image.Image; 
    - javafx.scene.image.ImageView; 
    - javafx.scene.input.KeyCode; 
    - javafx.scene.layout.Pane; 
    - javafx.scene.text.Text; 
   
 4. BallPane 
    - javafx.animation.KeyFrame; 
    - javafx.animation.Timeline; 
    - javafx.scene.layout.Pane; 
    - javafx.scene.paint.Color; 
    - javafx.scene.shape.Circle; 
    - javafx.util.Duration; 
   
 5. Credit 
    - javafx.geometry.Pos; 
    - javafx.scene.Parent; 
    - javafx.scene.control.Button; 
    - javafx.scene.control.Label; 
    - javafx.scene.layout.Pane; 

## Declartion
