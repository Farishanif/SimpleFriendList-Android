package com.example.myownproject;

import java.util.ArrayList;

public class FriendsData {
    private static String[] friendNames = {
            "Alvi",
            "Fatih",
            "Rachman",
            "Brandhana",
            "Chandra",
            "Teguh",
            "Albarofi",
            "Arlan",
            "Bayu",
            "Fathan"
    };

    private static String[] friendDetails = {
            "Sahabat baik saya dari SMA, dia suka bertingkah unik(random) dan mencoba hal baru terutama hal yang menarik dimatanya. Merupakan orang yang saya senangi untuk berbicara serius atau berdiskusi, serta pemberi motivasi dan saran yang sangat baik. Dia merupakan orang yang sangat pintar mengenai bisnis.",
            "Teman yang saya kenal saat memasuki jenjang perkuliahan, dia sering disebut orang rusia karena memiliki ketertarikan yang besar mengenai rusia dan ia adalah orang yang pantang menyerah. Dia biasa berkumpul dengan rachman dan faris untuk berdiskusi mengenai banyak hal dari komputer, hal jejepangan, jual beli dan lain-lain. Dia sekarang merupakan teman baik saya bersama rachman.",
            "Teman yang saya kenal saat memasuki jenjang perkuliahan, dia adalah orang ahli dalam masalah jual beli, masalah headset, dan juga rhytm game. Dia biasa berkumpul dengan rachman dan faris untuk berdiskusi mengenai banyak hal dari komputer, hal jejepangan, jual beli dan lain-lain. Dia sekarang merupakan teman baik saya bersama fatih.",
            "Teman yang saya kenal saat memasuki jenjang perkuliahan, dia adalah orang yang sangat baik dan juga orang yang sangat taat pada agamanya walaupun dia adalah anak yang sedikit cerobah dalam berbagai hal. Dia merupakan anak yang sangat senang mengajak teman-teman berbuat kabaikkan.",
            "Teman yang saya kenal saat memasuki jenjang perkuliahan, dia adalah orang yang sangat unik, karena dia merupakan orang-orang yang ahli mengenai meme. Selain itu dia juga mempunyai banyak pengetahuan umum mengenai komputer.",
            "Teman yang saya kenal saat memasuki jenjang perkuliahan, dia merupakan salah satu orang yang pikirannya susah di tebak dan juga orang yang tidak sering berbicara. Dia adalah seseorang yang sangat rajin dalam mencari acara-acara lomba, seminar, dan workshop. Dia juga memiliki banyak pengetahuan mengenai komputer dan suka bergabung dengan komunitas-komunitas TIK di internet.",
            "Teman yang saya kenal saat memasuki jenjang perkuliahan, dia merupakan orang yang lumayan senang bergaul dan sangat peduli pada teman-temannya. Dia merupakan jenis orang yang sangat mudah bergaul, tetapi selalu ingin menunjukkan diri pada teman-temannya.",
            "Teman yang saya kenal saat memasuki jenjang perkuliahan, dia adalah mahasiswa yang paling ahli komputer di kelas saya, mengetahui banyak hal dari yang umum sampai yang jarang diketahui kebanyakkan mahasiswa. Dia merupakan salah satu orang yang sering kami handalkan setiap ada permasalahan mengenai komputer. Serta dia merupakan orang yang senang memikirkan tentang cewek dan masalah tentang bola bersama bayu.",
            "Teman yang saya kenal saat memasuki jenjang perkuliahan, dia merupakan orang yang mudah diajak berbicara, dia merupakan orang yang sudah biasa berjualan dan dia pernah berjualan makanan di kelas perkuliahan kami. Dia juga merupakan orang yang suka membicarakan masalah tentang bola bersama arlan.",
            "Teman yang saya kenal saat memasuki jenjang perkuliahan, dia merupakan salah satu anak bandel di kelas kami, dia terlihat bandel karena mungkin senang bermain bersama orang-orang yang bandel, walaupun sebenarnya di merupakan orang yang baik. Dia orang yang terlihat sangat gemas dengan saya(saya tidak tahu kenapa)."
    };

    private static int[] friendImages = {
            R.drawable.alvi,
            R.drawable.fatih,
            R.drawable.rachman,
            R.drawable.nbrand,
            R.drawable.chandra,
            R.drawable.teguh,
            R.drawable.alba,
            R.drawable.arlan,
            R.drawable.bayu,
            R.drawable.fathan
    };

    static ArrayList<Friend> getListData() {
        ArrayList<Friend> list = new ArrayList<>();
        for (int position = 0; position < friendNames.length; position++) {
            Friend friend = new Friend();
            friend.setName(friendNames[position]);
            friend.setDetail(friendDetails[position]);
            friend.setPhoto(friendImages[position]);
            list.add(friend);
        }

        return list;
    }
}
