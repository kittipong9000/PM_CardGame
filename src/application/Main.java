package application;

import application.game.gameIo;

public class Main {

    public static void main(String[] args) {
        gameIo game = new gameIo(); // สร้างอ็อบเจ็กต์ของ gameIo

        game.start(); // เริ่มต้นเกม

        // วนลูปเพื่อทำซ้ำขั้นตอนเล่นเกม
        while (true) {
            game.updateGame(); // อัพเดทเกม

            game.playerPlay(); // ให้ผู้เล่นทำการเล่น

            // เช็คเงื่อนไขการจบเกม (ตายของศัตรู หรือ ชนะของผู้เล่น)
            // และออกจากลูปหากเกมจบ
            if (game.isGameOver()) {
                break;
            }
        }
    }
}
