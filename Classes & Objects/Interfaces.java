public class Interfaces {
    public static void main(String[] args) {
        King k=new King();
        k.move();

    }

}

interface chessPlayer {
    void move();
}

class Queen implements chessPlayer {
    public void move() {
        System.out.println("up,dwon,left,right,diagonal(in all dirms)");

    }
}

class Rook implements chessPlayer {
    public void move() {
        System.out.println("up ,dwon ,left, right");
    }
}

class King implements chessPlayer {
    public void move() {
        System.out.println("up,dwon,left right ,diagonal(by 1 step)");
    }
}
