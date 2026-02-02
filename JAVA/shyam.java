
//chapter no 2
// what is class 
// class is usre defnie type with proproties 
// the proporties of the class can be asses by using the obj
//creation of class
// class Rabbit{
//      int eye=;
//      int color;
//      int  nofotell;
//      char sound;
//     }
//     Rabbit r1= new Rabbit();
//     r1.eye=2;
//     r1.color=white;
// obj in java are created with the following syntax
//Animal abc =new Animal();
//wap to create class of "rabbi " and create obj
// write a program to create class of rabbit with proproties like eye color nofotell sound and assign the values to the obj
class Rabbit {

    int eye;
    int color;
    int nofotell;
    char sound;

    public static void main(String args[]) {
        Rabbit r1 = new Rabbit();
        r1.eye = 2;
        r1.color = 1; // 1 for white
        r1.nofotell = 1;
        r1.sound = 'H';

        System.out.println("Eye: " + r1.eye);
        System.out.println("Color: " + r1.color);
        System.out.println("No of tell: " + r1.nofotell);
        System.out.println("Sound: " + r1.sound);
    }
}

