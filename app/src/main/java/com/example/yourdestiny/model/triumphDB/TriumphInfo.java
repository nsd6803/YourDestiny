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
            {"Рейд: «Источник кошмаров»",
                    "Источник кошмаров",
                    "«Источник кошмаров» на уровне сложности «Мастер»",
                    "Коллективное сознание",
                    "Классический хоррор",
                    "Системный шок",
                    "Адская боль",
                    "Предвестники небытия",
                    "Ткачи снов",
                    "Терраформированные тайны",
                    "Получение книги «Источник кошмаров»",
                    "Освещенное мучение",
                    "Псионическая зачистка",
                    "Перекрестный огонь",
                    "Поднять щиты",
                    "Космический баланс",
                    "Единая орбита",
                    "Мы одна команда",
                    "Синхронность",
                    "Последний кошмар"},
            {"Сувениры из Неомуны",
                    "Неоконченное дело",
                    "Возвращение памяти",
                    "Разгон системы",
                    "Мастер выживания",
                    "Почетный Облачный бродяга",
                    "Сокровища терминала",
                    "Последняя Нить",
                    "Это не куклы"},
            {"Носитель Света",
                    "Гроза воителей",
                    "Дисциплина завоевателя",
                    "Тотальное завоевание"},
            {"Вечная доблесть",
                    "Высший пилотаж",
                    "Десятиборье",
                    "Золотой призер",
                    "Квалификационные матчи",
                    "Переход в следующий дивизион",
                    "Дебют в дивизионе",
                    "Только вверх",
                    "В погоне за репутацией"},
            {"Непоколебимая вера",
                    "Убежище",
                    "Страж Маяка",
                    "Так держать",
                    "Все ведет к победе"}};
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
            "Уничтожайте врагов с помощью оружия сезона «Сопротивление»: «Вечный цикл», «Блудное дитя», «Владыка», «Хранитель», «Умелый рассказчик» и «Королевский палач»."},
            {"Трофеи из рейда «Источник кошмаров».",
                    "Завершите любой вариант рейда «Источник кошмаров».",
                    "Завершите рейд «Источник кошмаров» на уровне сложности «Мастер».",
                    "Завершите все столкновения в рейде «Источник кошмаров» с боевой группой, состоящей из ваших товарищей по клану.\n",
                    "Завершите все столкновения в рейде «Источник кошмаров» с боевой группой, состоящей из Стражей одного класса.",
                    "Завершите все столкновения в рейде «Источник кошмаров» с боевой группой, состоящей только из персонажей подклассов Молнии.\n",
                    "Завершите все столкновения в рейде «Источник кошмаров» с боевой группой, состоящей только из персонажей подклассов Солнца.\n",
                    "Завершите все столкновения в рейде «Источник кошмаров» с боевой группой, состоящей только из персонажей подклассов Пустоты.\n",
                    "Завершите все столкновения в рейде «Источник кошмаров» с боевой группой, состоящей только из персонажей подклассов Нити.\n",
                    "Соберите добычу из всех спрятанных сундуков в рейде «Источник кошмаров».\n",
                    "Получите книгу «Источник кошмаров».",
                    "Выполните испытание «Освещенное мучение».\n",
                    "Победите всех псионов в Катаклизме с интервалом не более 1 секунды.\n",
                    "Выполните испытание «Перекрестный огонь».\n",
                    "В Делении сначала завершите цепь обоих узлов на одном этаже, а затем уничтожьте врагов со стихийными щитами на том же этаже.",
                    "Выполните испытание «Космический баланс».\n",
                    "Во время столкновения в Макрокосме игрок не может дважды получить эффект «Планетарное озарение» в течение одного планетарного сдвига.\n",
                    "Выполните испытание «Мы одна команда».\n",
                    "Во время последней битвы с Незареком активируйте обе группы узлов с интервалом не более 5 секунд и завершите бой.",
                    "Завершите все испытания в столкновениях на уровне сложности «Мастер»."},
            {"Трофеи из Неомуны, Нептун.",
                    "Выполните поручение «Неоконченное дело», которое дает Нимбус у Врат Бродяг в Неомуне.",
                    "Восстановите все поврежденные мемориалы в Зале героев Неомуны.\n",
                    "Пройдите любой Раздел за 7 минут.",
                    "Выполните любое задание кампании на уровне сложности «Мастер»",
                    "Получите все награды за ранги. Нимбус ждет вас.\n",
                    "Открывайте сундуки в конце заданий «Перегрузка терминала». Используя ключи «Перегрузки терминала», вы быстрее достигнете цели.",
                    "Выполните поручение «Последняя Нить», доступное у пруда поука в Зале героев Неомуны.\n",
                    "Соберите все уникальные фигурки в Неомуне и расставьте их по местам у Врат Бродяг.\n"},
            {"Получите рекордный счет в Сумрачном налете.\n",
                    "Уничтожайте воителей в Сумрачных налетах.",
                    "Завершите любой Сумрачный налет на уровне сложности «Грандмастер», играя за каждый из подклассов.\n",
                    "Завершите шесть разных Сумрачных налетов на уровне сложности «Грандмастер».\n"},
            {"Зарабатывайте ранги Горнила во всех сезонах.\n",
                    "Обнуляйте ранги Горнила во всех сезонах.\n",
                    "Завершайте матчи в разных режимах игры. Чем больше уникальных режимов, тем быстрее прогресс.",
                    "Получайте золотые медали Горнила.",
                    "Завершите квалификационные матчи в плейлисте состязательной игры.\n",
                    "Завершите серию матчей «Повышение» и перейдите в следующий дивизион.\n",
                    "Завершайте матчи из плейлиста «Состязательная игра 3 на 3». Победы позволяют достичь цели быстрее.\n",
                    "Доберитесь до дивизиона «Платина» в любом сезоне.\n",
                    "Зарабатывайте очки, выполняя задания в плейлисте «Состязательная игра 3 на 3».\n"},
            {"Выполните безупречное прохождение на пропуске «Уверенность».",
                    "Посетив Маяк хотя бы один раз, помогите другому игроку добраться до Маяка впервые.\n",
                    "Побеждайте в матчах на одном пропуске после достижения семи побед в текущем сезоне.\n",
                    "Выполните безупречное прохождение на разных картах.\n",
                    "Одержите несколько побед в Испытаниях с разными пропусками."}};
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
            "false"},
            {"false",
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
                    "false",
                    "false",
                    "false",
                    "false",
                    "false",
                    "false",
                    "false",
                    "false",
                    "false"},
            {"false",
                    "false",
                    "false",
                    "false",
                    "false",
                    "false",
                    "false",
                    "false",
                    "false"},
            {"false",
                    "false",
                    "false",
                    "false"},
            {"false",
                    "false",
                    "false",
                    "false",
                    "false",
                    "false",
                    "false",
                    "false",
                    "false"},
            {"false",
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
