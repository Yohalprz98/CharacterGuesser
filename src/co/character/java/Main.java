package co.character.java;

import javax.swing.JOptionPane;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int answer;
        int repeat;
        do {


            print("Welcome to guess the character\n\n"
                    + "Please think of one of the following characters:\n\n"
                    + "- Cristiano Ronaldo\n"
                    + "- Superman\n"
                    + "- Michael Jordan\n"
                    + "- Michael Jackson\n"
                    + "- Thanos\n"
                    + "- Leonardo DiCaprio\n"
                    + "- Iron Man\n"
                    + "- Dora the explorer\n"
                    + "- Scooby Doo\n"
                    + "- Joe Biden\n"
                    + "- Gabriel Garcia Marquez\n"
                    + "- William Shakespeare\n"
                    + "- Vladimir Putin\n\n");


            answer = ask("Now please answer the following questions:\n\n"

                    + "Your character exists or existed in real life?");

            if (answer == 0) {
                answer = ask("Does your character play any sport?");

                if (answer == 0) {
                    answer = ask("Does your character play football?");

                    if (answer == 0) {
                        print("Your character is: Cristiano Ronaldo");
                    } else {
                        print("Your character is: Michael Jordan");
                    }
                } else {
                    answer = ask("Is your character a politician?");

                    if (answer == 0) {
                        answer = ask("Is your character a politician from the United States?");

                        if (answer == 0) {
                            print("Your character is: Joe Biden");
                        } else {
                            print("Your character is: Vladimir Putin");
                        }
                    } else {
                        answer = ask("Is your character a writer?");

                        if (answer == 0) {
                            answer = ask("Is your character European?");

                            if (answer == 0) {
                                print("Your character is: William Shakespeare");

                            } else {
                                print("Your character is: Gabriel Garcia Marquez");
                            }
                        } else {
                            answer = ask("Is your character a singer?");

                            if (answer == 0) {
                                print("Your character is: Michael Jackson");
                            } else {
                                print("Your character is: Leonardo DiCaprio");
                            }
                        }
                    }
                }

            } else {
                answer = ask("Is your character the hero in his story?");

                if (answer == 0) {
                    answer = ask("Does your character have superpowers?");

                    if (answer == 0) {
                        print("Your character is: Superman");
                    } else {
                        print("Your character is: Iron Man");
                    }
                } else {
                    answer = ask("Is your character the villain in his story?");

                    if (answer == 0) {
                        print("Your character is: Thanos");
                    } else {
                        answer = ask("Is your character an animal?");

                        if (answer == 0) {
                            print("Your character is: Scooby Doo");
                        } else {
                            print("Your character is: Dora the explorer");
                        }
                    }
                }


            }
            repeat = ask("Do you want to play again?");
        } while (repeat == 0);

        print("Guess the character ended.");
    }

    public static void print(String text) {
        JOptionPane.showMessageDialog(null, text);

    }

    public static int ask(String text) {
        int answer = JOptionPane.showConfirmDialog(null, text, "Select an option",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return answer;
    }



}