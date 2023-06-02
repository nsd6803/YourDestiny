package com.example.yourdestiny.model.weaponDB;

import com.example.yourdestiny.R;

public class WeaponInfo {
    private String[] Name = {"Пиковый Туз", "Ртутная Буря",
            "Горстка Пепла", "Арбалет", "Бремя Идзанаги",
            "Остео Стрига", "Гьяллархорн", "Шепот Червя",
            "Центрифуга", "Навигатор"};
    private String[] Type = {"Револьвер", "Атомат",
            "Гранатомет", "Линейно-Плазменная винтовка", "Снайперская Винтовка",
            "Пистолет-пулемет", "Ракетная установка", "Снайперская Винтовка",
            "Автомат", "Лучевая винтовка"};
    private String[] Element = {"Кинетическое","Нитевое",
            "Кинетическое", "Кинетическое", "Кинетическое",
            "Кинетическое", "Огненное", "Огненное",
            "Электрическое", "Нитевое"};
    private int[] Pic = {R.drawable.weapon_spades_sq, R.drawable.weapon_quick,
            R.drawable.weapon_wither,R.drawable.weapon_arba,
            R.drawable.weapon_idza,R.drawable.weapon_osteo,
            R.drawable.weapon_gjall,R.drawable.weapon_worm,
            R.drawable.weapon_centri,R.drawable.weapon_navi};
    private int[] Pic_back = {R.drawable.weapon_spades, R.drawable.weapon_quick_s,
            R.drawable.weapon_wither_s,R.drawable.weapon_arba_s,
            R.drawable.weapon_idza_s,R.drawable.weapon_osteo_s,
            R.drawable.weapon_gjall_s,R.drawable.weapon_worm_s,
            R.drawable.weapon_centri_e,R.drawable.weapon_navi_s};
    private String[] Predicat = {"У меня всегда есть козырь в рукаве - Кейд-6", "Три слова, вырезанные чьей-то рукой: общность, альтруизм, осознанность",
            "«Словно неусыпный караульный», – Скиталец", "В Темную эпоху у нас не было линейно-плазменных винтовок. Но мы справлялись. — Скиталец винтовка", "Стыд. Вина. Страх. У кого из нас их нет. Соберите все свои сожаления и избавьтесь от них. Переложите свое бремя на врагов. – Ада-1",
            "«Победа заключается не в том, чтобы уничтожить врага, – а в том, чтобы превратить его силу в свою», – 9-е понимание, 7-я редакция Книги Скорби", "«Если разрушение обладает особой красотой, то почему красивым не может быть его орудие?» – Фейзел Крукс", "Сила Стража манит паразитов. Но не спеши их прогонять. Они могут быть тебе полезны... ведь их клыки в разы острее твоих зубов.",
            "Технологический прорыв или бесполезный хлам?", "Я погружаюсь, чтобы обрести понимание."};
    private String[][] Stats = {{"84","75","40","40","42","70","14","140","13"},
            {"84","75","40","40","42","70","14","140","13"},
            {"84","75","40","40","42","70","14","140","13"},
            {"84","75","40","40","42","70","14","140","13"},
            {"84","75","40","40","42","70","14","140","13"},
            {"84","75","40","40","42","70","14","140","13"},
            {"84","75","40","40","42","70","14","140","13"},
            {"84","75","40","40","42","70","14","140","13"},
            {"84","75","40","40","42","70","14","140","13"},
            {"84","75","40","40","42","70","14","140","13"}};
    private String[] Rare = {"Экзотическое","Экзотическое",
            "Экзотическое","Экзотическое",
            "Экзотическое","Экзотическое",
            "Экзотическое","Экзотическое",
            "Экзотическое","Экзотическое"};
    private int[] Exotic_pic = {R.drawable.memento, R.drawable.weapon_quick_e,
            R.drawable.weapon_wither_e,R.drawable.weapon_arba_e,
            R.drawable.weapon_idza_e,R.drawable.weapon_osteo_e,
            R.drawable.weapon_gjall_e,R.drawable.weapon_worm_e,
            R.drawable.weapon_centri_s,R.drawable.weapon_navi_e};
    private String[] Exotic_title = {"Мементо Мори","Трассирующие ракеты",
            "Муки Первобытника", "Совокупная сила", "Отточенная кромка",
            "Ревущий рой", "Снаряды «Волчья стая»", "Три в яблочко",
            "Конденсатор сверхзаряда", "Защитная ткань"};
    private String[] Exotic_descrypt = {"Перезарядка после убийства пополняет магазин пулями, которые наносят дополнительный урон. Включает радар во время прицеливания.",
            "После нескольких попаданий следующим выстрелом вы запускаете одну самонаводящуюся микроракету.",
            "Снаряды, выпущенные из этого оружия, заражают мором цель или окружающую территорию.",
            "Стреляет бронебойными снарядами, наносящими огромный урон вражеским щитам. Особенно эффективно против [Пробивание щитов] барьерных воителей.",
            "Чтобы зарядить оружие более мощным и дальнобойным патроном, использовав весь магазин, [Альтернативный режим оружия].",
            "Выпускает поток разумных ядовитых снарядов, которые выслеживают отмеченного противника.",
            "После выстрела боеприпасы взрываются, разделяясь на несколько самонаводящихся кассетных ракет.",
            "Увеличенный базовый урон от прицельных попаданий. Три быстрых прицельных попадания добавляют патроны в магазин.",
            "Во время стрельбы из этого оружия, а также при беге и скольжении накапливается временный электростатический заряд, повышая дальность стрельбы и скорость перезарядки. ",
            "Выстрелив из этого оружия в союзника, вы защитите цель и себя Плетеным панцирем."};

    private String[] Lore = {"Всем заинтересованным лицам:\n" +
            "Я, Кейд-6, будучи в твердом уме и (достаточно) здравом теле, настоящим заявляю, что вся принадлежавшая мне ранее собственность отныне переходит во владение убившего меня человека, пришельца, животного или природного явления.\n" +
            "Вышеупомянутая собственность включает в себя следующее (но не ограничивается этим):\n" +
            "– 'Пиковый туз'\n" +
            "– все тайники, что я оставил в системе\n" +
            "– Полковник, мой верный друг\n" +
            "– долги, список которых прилагается",
            "Три слова, вырезанные чьей-то рукой: общность, альтруизм, осознанность.\n" +
                    "\n" +
                    "//ЗАПУСК==СБОЙ.ОШИБВВ\n" +
                    "//ЗАПУСК==СБОЙ.ОШИБВВ\n" +
                    "//ЗАПУСК==СБОЙ.ОШИБВВ\n" +
                    "//ЗАПУСК\n" +
                    "//CS-AWS MK17.3\n" +
                    "//ошиб_общая==ГЛАВНАЯ=4E.4F.48.4F.4D.45==НЕУСТРАНОШИБКА\n" +
                    "//ошиб_общая==СИСТЕМА==48.41.52.44.57.41.52.45==НЕСОВМОБОРУДОВАНИЕ\n" +
                    "//ВОССТАНОВЛЕНИЕ\n" +
                    "//БЛИЗОСТЬ==3; МОДЕЛЬ экзо (БРЕЙ_особ); ПОКА (подросток); НЕИЗВЕСТНОЕ (!!ОСТОРОЖНО:ВНЕПРИЧИННОСТЬ!!)\n" +
                    "НЕИЗВЕСТН: …сказала, что мы полетим домой. Не хочу быть на Ганимеде. Тут никого нет.\n" +
                    "ЭКЗО: В этом и суть, Токки. Никто не погибнет, если эта штука превратится в «серую слизь».\n" +
                    "//РЕГИСТРАЦИЯ НЕИЗВЕСТН==ТОККИ\n" +
                    "ЭКЗО: Эти кожух и корпус в точности повторяют сделанные мной сканы. Не понимаю, почему он не стреляет.\n" +
                    "//БИОМЕТРИЯ==НЕРАСПОЗН\n" +
                    "Токки: Раз он не работает, может, вернешь мое красивое серебро? На мне оно смотрится лучше, чем на оружии.\n" +
                    "ЭКЗО: Твое украшение было частью оружия. Кто-то из внешней системы использует боевые наномашины. Впервые такое вижу.\n" +
                    "Токки: Это еще не значит, что ты можешь просто так брать чужие вещи.\n" +
                    "ЭКЗО: Я повидала ВСЕ, Токки.\n" +
                    "ПОКА: *контактСигнал.3*\n" +
                    "ЭКЗО: Почти все.\n" +
                    "ЭКЗО: Но, глядя на сканы, не могу понять, как в изначальном дизайне создавался толкающий импульс.\n" +
                    "Токки: Значит, вот почему ты сохранила тот фрагмент оригинального ствола?\n" +
                    "ЭКЗО: Нет. Кто-то потратил время и силы, чтобы вручную выгравировать этот девиз. Я сохранила его в знак уважения.\n" +
                    "Токки: Мне никогда не понять Стражей.\n" +
                    "ЭКЗО: Итак, здесь есть некто с оружием, подобного которому я никогда не видела. Принцип работы этого оружия я не понимаю и не знаю, как от него защищаться. Ближайший из знакомых мне аналогов – SIVA, но эти жуки намного более продвинуты.\n" +
                    "ПОКА: *согласиеСигнал.1*\n" +
                    "ЭКЗО: Рыба, прочь оттуда!\n" +
                    "//КЛЮЧ==ПОКА::ОБОЗН==ИСХД::подтверждено\n" +
                    "//ДОБАВИТЬПОЛЬЗОВАТЕЛЯ (д/н)==д\n" +
                    "ЭКЗО: Тупая зверушка, взорвешься ведь. Кыш.\n" +
                    "Токки: Мое серебро шевелится, Элси.\n" +
                    "//РЕГИСТРАЦИЯ МОДЕЛЬ ЭКЗО (БРЕЙ_особ)==ЭЛСИ\n" +
                    "//РЕГ НОВОГО ПОЛЬЗОВАТЕЛЯ==Элси\n" +
                    "Элси: Если это ствол…\n" +
                    "//КАЛИБРОВКА\n" +
                    "Элси: …а это магнитная ловушка.\n" +
                    "//КАЛИБРОВКА\n" +
                    "Элси: При нажатии спускового крючка заряд отделяется, но на самом деле запускается…\n" +
                    "//ВЫСТРЕЛ::ЭЛСИ.00000001\n" +
                    "ПОКА: *тревогаСигнал.1*\n" +
                    "Токки: ЧТО ТЫ СДЕЛАЛА?!\n" +
                    "Элси: Я ничего не меняла!\n" +
                    "Элси: Колония нанитов, видимо, создает каждый заряд с помощью… твердотельной роторной катушки.\n" +
                    "Токки: При таких размерах? Это похоже на… технологию Золотого века!\n" +
                    "Элси: Нет. Ничего подобного у нас не было.\n" +
                    "\n",
            "«Словно неусыпный караульный», – Скиталец\n" +
                    "\n" +
                    "Скиталец прислоняется к переборке «Изгоя»; перед ним на столе рассыпаны частицы Тьмы. Он выглядит расслабленным, но при этом внимательно смотрит на огромного титана.\n" +
                    "\n" +
                    "– Удивительно, что ты нашел время прийти сюда и донимать меня из-за этих крупинок, Джоксер. У тебя же вроде важное дело на орбите Ио. «Авангард» должен быть там. – Скиталец беспечно кладет руку на мощный гранатомет. – А ты ведь в последнее время стал верным бойцом «Авангарда», верно?\n" +
                    "\n" +
                    "– Скиталец, я не хочу тебя донимать, – фыркает Джоксер. – Считай, что я по-дружески тебя предупреждаю.\n" +
                    "\n" +
                    "– По-дружески? Значит, мы теперь друзья? – Скиталец еще крепче сжимает гранатомет. – Вот теперь ты пробудил во мне подозрения. Лучше говори как есть, Джоксер, или доставай пушку.\n" +
                    "\n" +
                    "– Люди говорят, что Пирамиды один раз едва не взяли верх. – Титан раздраженно качает головой. – Никто ничего толком не знает. Но если в конце концов они окажутся врагами, жесть начнется очень быстро. И если ты при этом останешься меж двух фронтов с мешком частиц Тьмы в руках, это тебе совсем не понравится.\n" +
                    "\n" +
                    "– А какое тебе дело, где я останусь? – Скиталец встает с гранатометом в руке. – Если, конечно, я не стою у тебя на пути.\n" +
                    "\n" +
                    "Джоксер поднимает руки, словно сдаваясь.\n" +
                    "\n" +
                    "– Знаешь что? Я пришел сюда, потому что хочу измениться. Исправить все, что натворил. После того, что произошло на Гамбите Прайм… Я должен был все исправить – и в том числе дать тебе дружеский совет: затаись ненадолго. – Он бросает взгляд на частицы Тьмы. – Но если не хочешь прислушаться к голосу разума, дело твое.\n" +
                    "\n" +
                    "Джоксер идет в заднюю часть корабля. Когда створки шлюза с шипением раскрываются, Скиталец кричит ему вслед:\n" +
                    "\n" +
                    "– Кстати, неплохая броня, Джоксер. Не забывай, откуда она у тебя.",
            "\"В Темную эпоху у нас не было линейно-плазменных винтовок. Но мы справлялись\". — Скиталец\n" +
                    "\n" +
                    "\"Нет, версия из Темной эпохи была лучше\".\n" +
                    "\n" +
                    "\"Кажется, Темная эпоха запомнилась нам по-разному\".\n" +
                    "\n" +
                    "\"Как по мне, тяжелый снаряд гораздо лучше энергии. Валит цели наверняка\".\n" +
                    "\n" +
                    "\"Энергия нужна для преодоления препятствий. Если мне нужно нанести тупую травму, я воспользуюсь кулаками\".\n" +
                    "\n" +
                    "\"Я и забыл, что ты был Полководцем\".\n" +
                    "\n" +
                    "\"Что значит \"был\"?\"\n" +
                    "\n" +
                    "\"Я думал, что ты объединился с Саладином и Фелвинтером\".\n" +
                    "\n" +
                    "\"Да. Но я по-прежнему верен себе\".\n" +
                    "\n" +
                    "\"Тогда почему...\"\n" +
                    "\n" +
                    "\"Пока выговоришь \"Полководец\", язык сломаешь\".\n" +
                    "\n" +
                    "\"Гамбиту нужны такие, как ты. Заходи как-нибудь. Кем бы ты себя не называл\".\n" +
                    "\n" +
                    "\"Спасибо. Ты лжец и мошенник. Держись подальше от моего Горнила\".",
            "\"Стыд. Вина. Страх. У кого из нас их нет. Соберите все свои сожаления и избавьтесь от них. Переложите свое бремя на врагов\". – Ада-1\n" +
                    "\n" +
                    "— Оно у меня, — говорю я, ощущая на себе пронзительный взгляд Генриетты. Экзо удерживает ее. Я чувствую, что в душе она изо всех сил убеждает меня не делать этого. Но я должна. Это то, что люди делают из любви. Принимают на себя бремя друг друга.\n" +
                    "\n" +
                    "Я не смотрю на нее. Не хочу, чтобы ее взгляд меня остановил.\n" +
                    "\n" +
                    "— То, что вам нужно. Этого нет у экзо. Оно у меня, — говорю я человеку с беспилотником.\n" +
                    "\n" +
                    "По лицу Генриетты струятся слезы. Она качает головой. Я все еще не смотрю на нее. Боюсь выдать свои чувства.\n" +
                    "\n" +
                    "— Юки, нет! Прошу, не на... — кричит Генриетта, но ее обрывает незнакомец.\n" +
                    "\n" +
                    "— Ш-ш-ш, дорогуша. Уймись, по-хорошему прошу. Дай нам с твоей подружкой закончить это дельце.\n" +
                    "\n" +
                    "Я почти никогда не видела ее в слезах. Она чаще была их причиной. Нередко утешать приходилось меня. Утирать слезы. И делала это она. Бесстрашная Генриетта. Что ж, Ген, сегодня моя очередь. Мой черед спасать тебя.\n" +
                    "\n" +
                    "Человек злобно хмурится и резко говорит:\n" +
                    "\n" +
                    "— Тогда давай сюда. Второй раз просить не буду. Я киваю, стараясь сохранять спокойствие. Пытаюсь подманить его. Ложным чувством безопасности.\n" +
                    "\n" +
                    "— Сейчас, только достану из сумки, — говорю я. Он качает головой.\n" +
                    "\n" +
                    "— Не так быстро, подруга. Он делает несколько шагов и останавливается в дюйме от меня, ткнув своей пушкой мне в лицо. — Таким образом мы обойдемся без глупостей. — И он кивком приказывает мне продолжать. Какое облегчение. Он заглотил наживку. И теперь заплатит. Но я еще не готова. Мне нужно... бросить последний взгляд. Посмотреть ей в глаза. Не могу удержаться. Все равно слишком поздно. Рука уже в сумке, и чека выдернута. Пути назад нет. Я бросаю короткий взгляд в ее сторону. Наши глаза встретились. У меня в душе воцаряется мир. Я улыбаюсь, чтобы она это знала. Надеюсь, она тоже обретет мир. Клянусь, у меня в голове звучат ее прощальные сло...",
            "«Победа заключается не в том, чтобы уничтожить врага, – а в том, чтобы превратить его силу в свою», – 9-е понимание, 7-я редакция Книги Скорби\n" +
                    "\n" +
                    "О, простите нас. Похоже, он всегда голоден. Когда я впервые стала матерью, я и не понимала, сколько времени я буду тратить только на то, что накормить его. Вы не возражаете? Спасибо.\n" +
                    "\n" +
                    "Да, я знаю, он не очень на меня похож. В наше время столько сирот. Я услышала его плач… мне показалось, что он где-то далеко, на другом конце планеты. Если честно, то все это произошло случайно. Я никогда не думала, что стану матерью, но необходимость заботиться о маленьком живом существе… так многому меня научила.\n" +
                    "\n" +
                    "Разрешите?\n" +
                    "\n" +
                    "Извините. Я не знаю, почему я так много вам рассказываю. Просто с вами так легко общаться. А когда я стала матерью, я столько узнала об отношениях с людьми. Раньше я уделяла слишком много времени работе. Из-за нее я даже потеряла нескольких друзей.\n" +
                    "\n" +
                    "Ой! Ш-ш-ш… Вот так. Да, растущим малышам нужен кальций.\n" +
                    "\n" +
                    "Теперь я вижу, что важно, а что – нет. Я вижу красоту в мелочах, в минутах тишины. Я вижу красоту людей, которые радуются, когда видят его. Я вижу, как он получает новый опыт благодаря новым знакомствам.\n" +
                    "\n" +
                    "Знаете, у меня был другой ребенок. Это было… раньше. Я не уберегла его. Это к лучшему. Теперь он… в безопасности.\n" +
                    "\n" +
                    "Кроме того, благодаря этому теперь я ценю своего малыша гораздо больше. Нас ведь всего двое.\n" +
                    "\n" +
                    "Обожаю моего маленького Стригу.\n" +
                    "\n" +
                    "И он всегда… такой… голодный.\n" +
                    "\n" +
                    "//ДЕЛО 620102; ЛИЧНОСТЬ ПОДОЗРЕВАЕМОГО: ЯНА-14; СТАТУС: НА СВОБОДЕ\n" +
                    "//УЛИКА #303, ЗВУКОЗАПИСЫВАЮЩЕЕ УСТРОЙСТВО; НАЙДЕНО РЯДОМ С РАСЧЛЕНЕННЫМ ТРУПОМ, РЕБРА ВЫРЕЗАНЫ",
            "«Если разрушение обладает особой красотой, то почему красивым не может быть его орудие?» – Фейзел Крукс\n" +
                    "\n" +
                    "Рэнди наконец-то добрался до Башни. Дорога от Космодрома была неблизкой, но Шоу Хан выдал ему точный маршрут. По пути из Старой России корабль взорвался всего дважды, а пока Рэнди защищал своего Призрака во время второго (и более качественного ремонта), то даже нашел кое-какую добычу!\n" +
                    "\n" +
                    "Материализовавшись на посадочной площадке у Башни, он увидел там толпу людей и Стражей всех «возрастов». Рэнди почувствовал, что от того, кто стоял в центре, исходит экзотическая, почти таинственная аура. Работая локтями, он протиснулся сквозь толпу и наконец понял, что привлекло сюда столько народа. Страж. Он стоял, поставив одну ногу на ограждение Башни. Призрак Рэнди несколько раз рассказывал о нем. Какой-то герой.\n" +
                    "\n" +
                    "Ну и что. Рэнди тоже герой.\n" +
                    "\n" +
                    "– Потрясающе, – восхищался какой-то титан, указывая на оружие в руках Стража. Рэнди посмотрел на титана: его лицо закрывал какой-то странный щиток, похожий на кусок кольчуги.\n" +
                    "\n" +
                    "– Обычная ракетная установка. Их повсюду полно. Я вчера в Старой России вот какую раздобыл, – похвастался Рэнди, расчехляя свое оружие.\n" +
                    "\n" +
                    "Вдруг его пихнул в бок собственный призрак, Дэнди.\n" +
                    "\n" +
                    "– Новобранец, слушай сюда, – сказал он. – В руках Стража суперсовременное устройство для развертывания «волчьих стай». Зверская штука, выпускает с каждым выстрелом целую стаю самонаводящихся микро-ракет. Не то оружие назвали «Роем».\n" +
                    "\n" +
                    "Рэнди достал свои «Дурные знамения».\n" +
                    "\n" +
                    "– Ну я могу попробовать поставить на нее модуль слежения, – усмехнулся Дэнди. – Наверное.\n" +
                    "\n" +
                    "Рэнди посмотрел на «Дурные знамения», и его гордость сменилась раздражением. В приступе ярости он бросил ракетную установку через голову Стража и через ограждение.\n" +
                    "\n" +
                    "Страж мгновенно развернулся и встал в боевую стойку. Затем он вскинул на плечо «Гьяллархорн» и выстрелил. Взрыв, похожий на извержение вулкана, разнес «Дурные знамения» на куски, а микро-ракеты устремились к каждому обломку и превратив их в фейерверк, задолго до того как они коснулись земли. В воздухе повис сладковато-едкий запах горящего топлива.\n" +
                    "\n" +
                    "Рэнди открыл рот от удивления.\n" +
                    "\n" +
                    "Страж шагнул к Рэнди и с улыбкой протянул ему «Гьяллархорн».\n" +
                    "\n" +
                    "– Начни свою легенду вот с этой штукой.",
            "Сила Стража манит паразитов. Но не спеши их прогонять. Они могут быть тебе полезны... ведь их клыки в разы острее твоих зубов.\n" +
                    "\n" +
                    "Зол, Повелитель тысяч армий, сгинул, но не был уничтожен. Смерть — это дорога, метаморфоза, темный союз между убийцей и жертвой. Сила, способная убить бога, является также желанной для него пищей. Это логика существования за счет жестокости, это контракт между двумя сущностями, отрицающими друг друга. Умирая, Зол вдоволь полакомился этой силой.\n" +
                    "\n" +
                    "И тогда Зол пришел к одержимым на Ио. Они кормили его разрушением и хотели сделать из него идола и предводителя. Но Зола манила лишь логика, которая не давала ему быть полностью уничтоженным. Он желал найти лишь доказательство меча, одно единственное обоснование. Он хотел стать силой, разделяющей сильнейших из живых и сильнейших из мертвых. И тогда он прошептал: \"Антем Анатем\". Это соблазн управлять объективной вселенной при помощи субъективной воли. И сказал он: \"Я научу тебя менять обстоятельства силой твоих желаний\". И сказал он: \"ВОЗЬМИ МЕНЯ И ИСПТЫТАЙ МОЩЬ ВРАГОВ СВОИХ\". Такова была его песнь. Айят.",
            "Технологический прорыв или бесполезный хлам?\n" +
                    "\n" +
                    "Выдержки из подготовленного до Коллапса отчета доктора Хатун-Роу, исследовательницы из инженерного отдела Новотихоокеанской Аркологии на Титане.\n" +
                    "\n" +
                    "В прошлом году доктор Пелл совершила прорыв в исследовании методов магнитного удержания, и благодаря ее наработкам нам удалось стабилизировать несколько ионных реакторов. Это позволило нашему отделу перейти от изучения плазменных технологий к разработке реальных прототипов…\n" +
                    "\n" +
                    "[Из-за того, что] турбины Аркологии производят больше энергии, чем мы потребляем, высший руководящий состав, несмотря на возражения Дэвида Мигеля Корошеца, решил начать испытания технологий, увеличивающих коэффициент передачи силы. Судя по всему, руководство надеется использовать в дополнение к инвазивной и дорогостоящей технологии сплайсинга генов силовые костюмы, которые, безусловно, позволят продлить время пребывания наших ныряльщиков на глубине…\n" +
                    "\n" +
                    "И хотя инициатива создания силовых костюмов сама по себе безопасна, настойчивое желание [руководства Аркологии] ускорить разработку технологии контролируемой ионной эмиссии явно указывает на дальнейшие планы по созданию оружия на ее основе.\n" +
                    "\n" +
                    "Разумеется, я посвящу все свое время выполнению поставленной задачи, но молюсь, чтобы это оружие не преодолело стадию прототипа и осталось пылиться, забытое всеми, в кладовке истории…",
            "Мой брат…\n" +
                    "\n" +
                    "Слова Зиву Арат…\n" +
                    "\n" +
                    "Богини войны…\n" +
                    "\n" +
                    "ДАР. Моя истинная смерть была данью необходимости. Все прочие – плодом моей любви. Ойкумена загнала нас в угол, заставила делать то, что нам претило. Используя мою силу, Арикс сразил нашу сестру. Используя нашу силу, он спустился в Глубины. Наша сила позволила Ориксу расправить крылья, и он затмил небо Ойкумены.\n" +
                    "\n" +
                    "МОЙ ДВОР. Своими воспоминаниями и сражениями он вернул меня сюда. Вернул во всем великолепии любви, что затачивает наши клинки и убивает.\n" +
                    "\n" +
                    "МОГИЛА. Я найду место, где гниет его труп. Он заслужил смерти. Мы не копаем нашим мертвым могилы.\n" +
                    "\n" +
                    "ШПИЛЬ. Я возьму все истинное и стану разрушать, пока не останется нерушимое. Я найду секреты своей сестры и разрушу их тоже.\n" +
                    "\n" +
                    "СТРАНСТВИЕ. Моя любовь вырывается наружу. Моя любовь поглощает. Я отправлюсь странствовать по вселенной, как это сделал мой брат. И со мной будут воспоминания о нем."};

    private String[] For_class = {"Охотник","Охотник",
            "Варлок","Варлок",
            "Титан","Экзотическое",
            "Экзотическое","Экзотическое",
            "Экзотическое","Экзотическое"};

    private String[] For_subclass = {"Пустота","Нить",
            "Огонь","Огонь",
            "Экзотическое","Экзотическое",
            "Экзотическое","Экзотическое",
            "Экзотическое","Экзотическое"};

    private String[] For_activity = {"Горнило","Налет",
            "Рейд","Рейд",
            "Экзотическое","Экзотическое",
            "Экзотическое","Экзотическое",
            "Экзотическое","Экзотическое"};

    public String getLore(int count){
        return Lore[count];
    }
    public String getClas(int count){
        return For_class[count];
    }
    public String getSubclas(int count){
        return For_subclass[count];
    }
    public String getActivityy(int count){
        return For_activity[count];
    }
    public String getName(int count){
        return Name[count];
    }
    public String getType(int count) {
        return Type[count];
    }

    public String getElement(int count) {
        return Element[count];
    }

    public int getPic(int count) {
        return Pic[count];
    }

    public int getPic_back(int count) {
        return Pic_back[count];
    }

    public String getPredicat(int count) {
        return Predicat[count];
    }

    public String[] getStats(int count) {
        return Stats[count];
    }

    public String getRare(int count) {
        return Rare[count];
    }

    public int getExotic_pic(int count) {
        return Exotic_pic[count];
    }

    public String getExotic_title(int count) {
        return Exotic_title[count];
    }

    public String getExotic_descrypt(int count) {
        return Exotic_descrypt[count];
    }

    public String[] getName() {
        return Name;
    }
}
