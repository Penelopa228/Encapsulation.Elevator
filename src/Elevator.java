public class Elevator {
       private int currentFloor=1;
       private int minFloor;
       private int maxFloor;
       public Elevator (int minFloor, int maxFloor) {
           this.minFloor=minFloor;
           this.maxFloor=maxFloor;
       }

       public int getCurrentFloor() {
           return currentFloor;
       }

    public void moveDown () {
            currentFloor=currentFloor>minFloor?currentFloor-1:currentFloor;

    }
    public void moveUp () {
        currentFloor=currentFloor<maxFloor?currentFloor+1:currentFloor;

    }
    public void move ( int floor) {
           if(currentFloor<floor&floor<=maxFloor){
        while (currentFloor<floor) {
            moveUp();
            System.out.println(currentFloor);
        }

            }
           if(currentFloor>floor&floor>=minFloor){
               while (currentFloor>floor) {
                   moveDown();
                   System.out.println(currentFloor);
               }
           }
       }
    }

