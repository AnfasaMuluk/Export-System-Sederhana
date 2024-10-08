package com.mycompany.sistempakar1;

import java.util.*;

public class UI {
    
    private ArrayList<String> questions;
    private int answers[];
    
    public UI() {
        this.answers = new int[24];
        this.questions = new ArrayList<>();
        this.setQuestions();
    }
    
    private void setQuestions() {
        // Definisikan pertanyaan terkait dengan gejala
        questions.add("Daun Berwarna Klorosis");
        questions.add("Mengalami retardasi pertumbuhan?");
        questions.add("Daun menggulung dan terpilin");
        questions.add("Pembentukan tongkol terganggu");
        questions.add("Daun tampak kering");
        questions.add("Beberapa bercak kecil bersatu membentuk bercak yang lebih besar");
        questions.add("Bercak coklat muda memanjang berbentuk gulungan atau perahu");
        questions.add("Keluar serbuk seperti tepung coklat kekuningan");
        questions.add("Bercak merah pada pelepah daun");
        questions.add("Terdapat benang-benang berbentuk tidak beraturan yang berwarna putih kemudian coklat");
        questions.add("Pembengkakan tongkol");
        questions.add("Terbentuk kelenjar pada biji");
        questions.add("Biji membengkak");
        questions.add("Kelobot terbuka dan muncul banyak jamur putih ke hitam");
        questions.add("celah di batang");
        questions.add("batang dan rumbai (bunga jantan) mudah patah");
        questions.add("tumpukan rumbai yang patah");
        questions.add("ada lubang kecil di daun");
        questions.add("ada tepung/kotoran di sekitar kerekan");
        questions.add("daun agak menguning");
        questions.add("lubang melintang di daun pada fase vegetatif");
        questions.add("bulu tongkol jagung terpotong/mengecil/kering");
        questions.add("ujung tongkol ada kerekan");
        questions.add("sering terdapat larva");
    }    
    
    public void showQuestion() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        for (String q : this.questions) {
            System.out.println(q);
            System.out.println("0. Tidak    1. Ya");
            int a = sc.nextInt();
            while (a != 0 && a != 1) {
                System.out.println("Jawaban tidak sesuai!");
                a = sc.nextInt();
            }
            answers[i] = a;
            i++;
        }
    }
    
    public Set<String> getFacts() {
        Set<String> facts = new HashSet<>();
        if (answers[0] == 1) facts.add("g1");
        if (answers[1] == 1) facts.add("g2");
        if (answers[2] == 1) facts.add("g4");
        if (answers[3] == 1) facts.add("g5");
        if (answers[4] == 1) facts.add("g10");
        if (answers[5] == 1) facts.add("g7");
        if (answers[6] == 1) facts.add("g8");
        if (answers[7] == 1) facts.add("g14");
        if (answers[8] == 1) facts.add("g12");
        if (answers[9] == 1) facts.add("g13");
        if (answers[10] == 1) facts.add("g15");
        if (answers[11] == 1) facts.add("g18");
        if (answers[12] == 1) facts.add("g17");
        if (answers[13] == 1) facts.add("g19");
        if (answers[14] == 1) facts.add("g21");
        if (answers[15] == 1) facts.add("g23");
        if (answers[16] == 1) facts.add("g24");
        if (answers[17] == 1) facts.add("g20");
        if (answers[18] == 1) facts.add("g26");
        if (answers[19] == 1) facts.add("g27");
        if (answers[20] == 1) facts.add("g28");
        if (answers[21] == 1) facts.add("g29");
        if (answers[22] == 1) facts.add("g30");
        if (answers[23] == 1) facts.add("g31");
        
        return facts;
    }
    
    public void showConclusions(boolean aIsTrue, boolean bIsTrue, boolean cIsTrue, boolean dIsTrue, boolean eIsTrue, boolean fIsTrue, Set<String> facts, Set<String> inferredFacts) {
        System.out.println("\nFakta yang diberikan: " + facts);
        System.out.println("Fakta yang disimpulkan: " + inferredFacts);

        // List to store all true conclusions
        List<String> trueConclusions = new ArrayList<>();

         if (aIsTrue) {
            trueConclusions.add("Tanaman jagung Anda terkena penyakit Bulai.\n" +
                    "Deskripsi: Penyakit ini menyebabkan daun jagung tampak pucat atau klorosis dan memperlambat pertumbuhan.\n" +
                    "Pengendalian: Gunakan benih tahan bulai, rotasi tanaman, dan penyemprotan fungisida.\n");
        }
        if (bIsTrue) {
            trueConclusions.add("Tanaman jagung Anda terkena penyakit Hawar Daun.\n" +
                    "Deskripsi: Penyakit ini menyebabkan bercak coklat memanjang pada daun yang dapat menyatu menjadi lebih besar.\n" +
                    "Pengendalian: Gunakan varietas tahan, potong daun terinfeksi, dan semprotkan fungisida sesuai anjuran.\n");
        }
        if (cIsTrue) {
            trueConclusions.add("Tanaman jagung Anda terkena penyakit Karat Daun.\n" +
                    "Deskripsi: Bercak kecil berwarna merah pada daun yang menyebar seperti karat.\n" +
                    "Pengendalian: Rotasi tanaman, gunakan varietas tahan karat, dan gunakan fungisida jika diperlukan.\n");
        }
        if (dIsTrue) {
            trueConclusions.add("Tanaman jagung Anda terbakar.\n" +
                    "Deskripsi: Daun terlihat kering dan menguning karena sinar matahari berlebihan atau kekurangan air.\n" +
                    "Pengendalian: Pastikan penyiraman rutin dan hindari sinar matahari berlebihan.\n");
        }
        if (eIsTrue) {
            trueConclusions.add("Tanaman jagung Anda terkena penyakit Penggerek Batang.\n" +
                    "Deskripsi: Larva menyerang batang tanaman jagung dan merusak jaringan.\n" +
                    "Pengendalian: Rotasi tanaman, periksa tanaman secara berkala, dan berikan insektisida jika diperlukan.\n");
        }
        if (fIsTrue) {
            trueConclusions.add("Tanaman jagung Anda terkena penyakit Penggerek Tongkol.\n" +
                    "Deskripsi: Larva menyerang dan merusak biji dalam tongkol, mengurangi kualitas panen.\n" +
                    "Pengendalian: Hancurkan sisa tanaman terinfeksi, semprotkan insektisida bila diperlukan.\n");
        }

        // Print all true conclusions with detailed descriptions and treatment
        if (!trueConclusions.isEmpty()) {
            System.out.println("\nKesimpulan yang terbukti:\n");
            for (String conclusion : trueConclusions) {
                System.out.println(conclusion);
            }
        } else {
            System.out.println("Kesimpulan: Tidak ada kesimpulan yang terbukti.");
        }
    }
}
