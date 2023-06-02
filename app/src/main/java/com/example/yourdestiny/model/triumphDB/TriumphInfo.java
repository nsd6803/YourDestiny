package com.example.yourdestiny.model.triumphDB;

import java.util.Objects;

public class TriumphInfo {
    private String[] Names = {"Queensguard",
    "Dream Warrior",
    "Virtual Fighter",
    "Conqueror",
    "Glorious",
    "Flawless"};

    private String[][] Titles = {{"Несломленные и несгибаемые",
            "Ключник непокорных",
            "Модернизация",
            "Сельское радио",
            "Приверженность справедливости",
            "Грация под огнем",
            "Притягательность рвения",
            "Устранитель крупной дичи",
            "Легендарная триада",
            "Ctrl + Alt + готово",
            "Отключение алгоритмов безопасности",
            "Погибель Света"},
                    };
    private String[][] Descriptions = {{"Завершите все этапы в серии поручений «Нас не сломить».",
            "Используйте ключи непокорных, чтобы получать дополнительные награды после завершения заданий на полях сражений сезона «Сопротивление».",
            "Приобретайте улучшения у командного терминала в ШЛЕМе",
            "Прослушайте сообщения на Ферме",
            "Получайте дары справедливости, выполняя задания сезона «Сопротивление».",
            "Получайте дары грации, выполняя задания сезона «Сопротивление».",
            "Получайте дары рвения, выполняя задания сезона «Сопротивление»",
            "Уничтожайте воителей или боссов, выполняя задания из плейлиста «Поля сражений непокорных».\n",
            "Выполните задания «Поля сражений непокорных» на уровне сложности «Легенда» в ЕМЗ, на Космодроме и в орбитальной тюрьме",
            "Выполните все три поручения в пространстве //узл.упр.АВАЛОН//.\n",
            "Выполните задание «//узл.упр.АВАЛОН//» на уровне сложности «Легенда» или выше.",
            "Уничтожайте врагов с помощью оружия сезона «Сопротивление»: «Вечный цикл», «Блудное дитя», «Владыка», «Хранитель», «Умелый рассказчик» и «Королевский палач»."},};
    private String[][] isChecked = {{"false",
            "false",
            "false",
            "false",
            "false",
            "false",
            "false",
            "false",
            "false",
            "false",
            "false",
            "false"}};

    public String getNames(int count) {
        return Names[count];
    }

    public String[] getNames() {
        return Names;
    }
    public String[] getTitles(int count) {
        return Titles[count];
    }

    public String[] getDesctuptions(int count) {
        return Descriptions[count];
    }

    public String[] getIsChecked(int count) {
        return isChecked[count];
    }

    public String setIsChecked(int count, String name, String state) {
        isChecked[findItem(name)][count] = state;
        return isChecked[findItem(name)][count];
    }

    public int findItem(String name){
        for(int i = 0; i < Names.length;i ++){
            if(Objects.equals(Names[i], name)){
                return i;
            }
        }
        return 0;
    }
}
