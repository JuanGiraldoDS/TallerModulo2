package Modulo2Taller;

public class IslaParametrisada {
    private Piece[][] board;

    public IslaParametrisada() {
        this.board = new Piece[8][8]; // 8x8 chessboard
        setupPieces();
    }


    private void setupPieces() {
        // Initial setup will be detailed in subsequent snippets
        // Place Rooks
        board[0][0] = new Wolf( new Position(0, 0));
        board[0][7] = new Wolf( new Position(0, 7));
        board[7][0] = new Wolf( new Position(7, 0));
        board[7][7] = new Wolf( new Position(7, 7));
        // Place Knights
        board[0][1] = new Conejo( new Position(0, 1));
        board[0][6] = new Conejo(new Position(0, 6));
        board[7][1] = new Caballo( new Position(7, 1));
        board[7][6] = new Caballo( new Position(7, 6));
        // Place Bishops
        board[0][2] = new Aguila( new Position(0, 2));
        board[0][5] = new Aguila( new Position(0, 5));
        board[7][2] = new Oso( new Position(7, 2));
        board[7][5] = new Oso( new Position(7, 5));
        // Place Queens
        board[0][3] = new Pato( new Position(0, 3));
        board[7][3] = new Pato( new Position(7, 3));
        // Place Kings
        board[0][4] = new Zorro( new Position(0, 4));
        board[7][4] = new Zorro( new Position(7, 4));
        // Place Pawns
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Oruga( new Position(1, i));
            board[6][i] = new Oruga( new Position(6, i));
    }
} }
