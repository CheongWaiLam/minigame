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
   Main goals of the game  > Game mechanics > Game style and technical requirements > Character design(chameleon and dog) and Game scenarios  > User Interface (UI) > Game code  > Credit > Game testing and modification  
  
  
  We start by planning the main goals of the game, game mechanics, game style and technical requirements. 
  1. **Main goals**
  
     Timber-dog game: Controlling the dog eats the big bone and watch out for overhanging wooden bars. 

     Pinball-chameleon game: Controlling the chameleon to catch the balls falling from aboded. 

  2. **Game mechanics**
  
     Timber-dog game: Player takes control of the dog, stands in front of the bone and starts hitting it from the left(press A), then from the right(press D). Player has to watch out for overhanging wooden bars. As soon as player sees one on one side of the bone, player must quickly move to the other. If player don't, player will lose - the dog will be crushed and player will have to start over. 

     Pinball-chameleon game: Player need to use the keys A and D on the keyboard to move left and right, and catch the balls falling from above. If player does not catch the ball the game will end. 
     
  3. **Game style**
  
     Casual game, pixel, two classic games, just clear the game. 
     
  4. **Technical requirements**

     We want two games in this software, then we want player can freely choose the game they want to play so we want to create a home page to let the player press two buttons to choose these two games. Also player can go back to the home page and choose another game to play until the player quits. Finally, we want a credit button in the homepage and the credit page to show our creators list.

  5. **Character design**

     We use pixel style for character design, so that the whole process will not be too complicated, and the characters can be presented simply, making the whole game more casual.  
     
    The dog and chameleon below the picture are the characters we will see in the game, goback button is the return button we can see in the game, which can return to the home page and the credit button is the return button which can return to home page or credit page. 
     
  6. **Game scenarios**
  
     For the game scene, we used simple colors, alternating warm and cool colors, and we used pink and purple to make the scene more comfortable. 
     
     ![Credit](https://raw.githubusercontent.com/Poole0/minigame/main/credit.PNG)
     ![Go back](https://raw.githubusercontent.com/Poole0/minigame/main/monkey.png) 
     ![Dog](https://raw.githubusercontent.com/Poole0/minigame/main/dog.png) 
     ![Chameleon](https://raw.githubusercontent.com/Poole0/minigame/main/chameleon.png)
     
 7. **User Interface (UI), Game code, Credit** 
     User Interface (UI): In the UI, we use three button, one background and three labels to show with the player. 
 
     Game code: We use Javafx language to make these games and have tested and modified many times to ensure the stability and fluency of game. 
 
     Credit: In the Credit page, we use one button, one background and two labels to show pur creators list. 
 
     In order to ensure that all aspects of the game can work properly, we constantly test the gameplay, balance, stability and security of the game. 
     
  8. **Game testing and modification**
  
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
  
  In the first week, we are going to figure it out what functions in this software. We want two games in this software, then we want a home page to let the player choose these two games, finally we want a credit page to show our creators list.  
  
  In the second week, we are going to design our game style. Our game style we want to use pixel style to design it, then one member to design our characters, backgrounds, buttons, labels, credit page and home page. Also, the other two members need to develop two games(Timber-dog, Pinball-chameleon) separately. When they are developing two games, they design to work in Javafx.    
  
  In the third week, we have the last member is going to test our software. If there are errors in the above tests, member will  tell the go back to design and develop it. 
  
  In the last week, we are going to do an evaluation, write our README.md and record our demo. 
  
  In the evaluation, here are some questions to evaluate.   
  1. How long are the meetings? 
  2. How many issues are discussed during the meetings? 
  3. How often is build made for testing? 
  4. How many bugs in our software? 
  5. How many times will a test member usually test a feature in our software? 

- ### Algorithm
In timber-dog, we use the randomized algorithm. The position where the board appears is random. Therefore, by the randomized algorithm, the boards can be generated randomly on the left or right side.  

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
  Concerning: 
  Animals Party 
  
VU CHE FEI(Sam), IAM CHON KIT(Leon), KUAN WING YU(Kiki), CHEONG WAI LAM(Tommy) , the creators of the underlying material on which the video game is based. 
  
Declaration by Creator 

We, VU CHE FEI(Sam), IAM CHON KIT(Leon), KUAN WING YU(Kiki), CHEONG WAI LAM(Tommy), are Chinese citizen. We are ordinarily resident in Macau. 
 
We, VU CHE FEI(Sam), IAM CHON KIT(Leon), KUAN WING YU(Kiki), CHEONG WAI LAM(Tommy), created the original underlying material, a concept 2D game, titled “Animals Party”, 16/04/2023 created. 
 
We declare that we have made inquiries as to the truth of the particulars set out in this Statement and that to the best of our knowledge and belief the said particulars are true and complete in all respects. We make this solemn declaration conscientiously believing it to be true.
