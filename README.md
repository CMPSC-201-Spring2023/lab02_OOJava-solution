# Java in an Object Oriented World

## DUE: February 7 by 2:30pm

## Table of Contents

- [Introduction](#introduction)

- [Learning](#learning)

- [Docker Instructions](#docker-instructions)

  - [progator Docker Image](#progator-docker-image)

- [Running Java](#running-java)

- [Program Requirements](#program-requirements)

- [Assignment Assessment](#assignment-assessment)

- [GatorGrade](#gatorgrade)

- [Assistance](#assistance)

## Introduction

This assignment requires programmers to implement and test a bank ATM system. First, the program will display a welcome message and read the user's card information from the text file. Then, it will read in user's preferred actions and, finally, produce output that meets the requirements outlined later in the assignment. As verified by [Checkstyle](https://github.com/checkstyle/checkstyle), the source programs must adhere to all of the requirements in the [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html).

The programmers are also responsible for writing a three-paragraph reflection, stored in the file `writing/reflection.md`, that explains the challenges that they faced and the solutions they developed and their strategy for testing their solution. This is a Markdown file that must adhere to the standards described in the [Markdown Syntax Guide](https://guides.github.com/features/mastering-markdown/). Remember, you can preview the contents of a committed Markdown file by clicking on the name of the file in your GitHub repository.

## Learning

If you have not done so already, please read all of the relevant [GitHub Guides](https://guides.github.com/) that explain how to use many of the features that GitHub provides.

To enhance your understanding of some points in this laboratory assignment, you should also review the class exercise. Please see the course instructor or one of the teaching assistants or tutors if you have questions about any of these reading assignments.

## Docker Instructions

In this course we will use Docker for an environment where we can compile and execute programs. This provides an environment with the languages that will be used in the class and ensures that everyone uses the same versions for help and grading purposes. If you do not have Docker set up from a previous class, please do so first.

- [Docker Mac Setup](https:/docs.docker.com/docker-for-mac/install/)
- [Docker Ubuntu Setup](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-ubuntu-18-04)
- [Docker Windows Setup](https:/docs.docker.com/docker-for-windows/install/)

If the setup goes correctly as desired, you should be able to get started and validate the Docker version and run the hello world docker container using the following commands:

```
docker --version
docker run hello-world
```

### progator Docker Image

Follow the instructions below, which can also be found at the `progator` Docker image link provided below, to get started. Additionally, please watch the lab introduction video for a working example of how to access the Docker image for this course and how to mount a directory as a volume.

[progator Docker Image](https://hub.docker.com/repository/docker/janyljumadinova/progator)

#### Pulling Image

Download automated build from public Docker Hub Registry:

`docker pull janyljumadinova/progator`

#### Running

You can mount a directory as a volume with the argument *-v /your-path/directory/:/root/ like this :

`docker run -d -p 80:80 -v /your-path/:/root/environment janyljumadinova/progator`

Otherwise, you can start a Docker container without connecting your directory as shown below but you will not be able to access your lab files from within Docker:

`docker run -d -p 80:80 janyljumadinova/progator`

#### Accessing the IDE

<http://localhost>

### Running the Java locally

If you have Java installed locally, you can also run Java locally from the `src` directory.

## Running Java

To compile a single program type run `javac ProgramName.java`

To compile all programs inside the directory, run `javac *.java`

To run the Java program with the main method, run `java ProgramName`

## Program Requirements

You will notice that this assignment organizes the functionalities into three separate classes. In particular, the `Atm` provides the user interface for our program and the `Account` furnishes the methods that perform the required computations and the `Offer` class has methods for providing the user with an offer from the bank. If you want to make changes to the way in which the program accepts input or produces output, then you will need to modify the `Atm` class. Otherwise, if you want to modify the way in which the program performs a computation, or add a new computation, then you must make changes to the Account and/or Atm. Please see the instructor if you have questions about this approach.

User's input is simulated via a text file, that are provided in the input directory. Please study the Java statements in the `Atm` class to figure out what each line in each text file correspond to. For example, in the "user input.txt" the first line of the user's input is the pin number, the second line refers to either a checking or a savings account, the third line gives the user's desired action that can be either "withdraw" or "deposit", followed by the amount of a desired deposit or a withdrawal.

Additionally, it is important to note that this assignment asks you to complete implementation from scratch in both the `Offer.java` and `Account.java` files, and to finish implementation in the `Atm.java` file (look for the TODO tags).

The `Account` and `Offer` classes have to follow the specification of the UML diagram provided below. In the `Account`, the `getBalance` method should return the current balance, withdraw method should update the balance by subtracting the withdrawal amount from it if there is enough money, while the deposit method should add the deposit amount to the current balance, and `getOffer` method should obtain the advertisement offer object from the bank that consists of offer id and the offer text. In the `Offer`, `setOffer` method should allow for a change the text of the bank's advertisement offer to occur, `getOfferText` should return the text of the offer, and `getOfferId` should return the id of the offer.

| Account
| ---------------------
| - `int accountNumber`
| - `double balance`
| - `Offer offer`

| Offer
| ---------------------------------------------------------------------------
| - `int offerId`
| - `String offerText`
| <

<constructor>&gt; <code>Offer (int id, String text)</code></constructor>
| + `setOffer (String newOffer)`
| + `getOfferText() : String`
| + get OfferId(): int`

The source code of the two Java file must also pass additional tests set by the [GatorGrader tool](https://github.com/GatorEducator/gatorgrade). As before, GatorGrader will check to ensure that one of the Java files uses the `new Date()` construct in the Java code. Moreover, GatorGrader will check the following characteristics of your implementation:

- The `Atm` program must:

  - Contain at least five single-line comments and two multi-line comments
  - Use at least two `if` and `else` statements
  - Contain at least ten `println` statements to display output
  - Call methods of the other provided class

- The `Account` program must:

  - Contain at least five multi-line comments
  - Not include any `println` statements
  - Include a constructor as specified by the UML diagram in the assignment sheet
  - Include `withdraw`, `deposit` and `getBalance` methods as outlined in the assignment sheet

- The `Offer` program must:

  - Contain at least five multi-line comments
  - Not include any `println` statements
  - Include a constructor as specified by the UML diagram in the assignment sheet
  - Include `setOffer`, `getOfferText` and `getOfferId` methods as outlined in the assignment sheet

## Expected Program Output

Due to the different input values passed to this program, running the program produces textual output that will differ from the instructor's version shown below. Your program must adhere to all of the requirements for the assignment and pass all of the verification checks, producing textual output that follows the pattern that is specified in the program requirements.

```
Welcome to JJ ATM!

Finding your account information.

Linking to your checking account details.

First, let's check your balance
Your current balance is $1000.0
Okay, you would like to withdraw $100
Your updated balance is $900.0
Offer id 123: Get $10 back when you spend $3000 in 30 days. Offer valid until 11/31/2018.

Thank you for using JJ ATM!
```

## Assignment Assessment

The grade that a student receives on this assignment will have the following components.

- **GitHub Actions CI Build Status [up to 40%]:** For lab01 repository associated with this assignment students will receive a checkmark grade if their last before-the-deadline build passes.

- **Mastery of Technical Writing [up to 15%]:** Students will also receive a checkmark grade when the responses to the writing questions presented in the `reflections.md` reveal a proficiency of both writing skills and technical knowledge. To receive a checkmark grade, the submitted writing should have correct spelling, grammar, and punctuation in addition to following the rules of Markdown and providing conceptually and technically accurate answers.

- **Mastery of Technical Knowledge and Skills [up to 45%]:** Students will receive a portion of their assignment grade when their lab implementation reveals that they have mastered all of the technical knowledge and skills developed during the completion of this assignment. As a part of this grade, the instructor will assess aspects of the project including, but not limited to, the completeness and correctness of the program, the use of effective source code comments and Git commit messages.

All grades for this project will be reported through a student's gradebook GitHub repository.

## GatorGrade

You can check the baseline writing and implementation requirements of this project by running department's assignment checking `gatorgrade` tool To use `gatorgrade`, you first need to make sure you have Python installed. If not, please see:

- [Setting Up Python on Windows](https://realpython.com/lessons/python-windows-setup/)
- [Python 3 Installation and Setup Guide](https://realpython.com/installing-python/)
- [How to Install Python 3 and Set Up a Local Programming Environment on Windows 10](https://www.digitalocean.com/community/tutorials/how-to-install-python-3-and-set-up-a-local-programming-environment-on-windows-10)

Then, you need to install `gatorgrade`:

- First, [install `pipx`](https://pypa.github.io/pipx/installation/)
- Then, install `gatorgrade` with `pipx install gatorgrade`

Finally, you can run `gatorgrade`:

`gatorgrade --config config/gatorgrade.yml`

## Assistance

If you are having trouble completing any part of this project, then please talk with the course instructor or technical leaders during the laboratory session. Alternatively, you may ask questions in the Discord channel for this course. Finally, you can schedule a meeting during the course instructor's office hours.
