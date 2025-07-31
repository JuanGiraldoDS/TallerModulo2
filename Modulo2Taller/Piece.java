package Modulo2Taller;

public abstract class Piece {
    protected Position position;


    public Piece(Position position) {

        this.position = position;
    }


    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    public void movePiece(Position start, Position end) {
        // Check if there is a piece at the start position and if the move is valid
        if (board[start.getRow()][start.getColumn()] != null &&
                board[start.getRow()][start.getColumn()].isValidMove(end, board)) {

            // Perform the move: place the piece at the end position
            board[end.getRow()][end.getColumn()] = board[start.getRow()][start.getColumn()];

            // Update the piece's position
            board[end.getRow()][end.getColumn()].setPosition(end);

            // Clear the start position
            board[start.getRow()][start.getColumn()] = null;
        }
    }
}


