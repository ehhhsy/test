import java.util.*;
/*
   实验3
 */
public class StudentSystem {
    static HashMap<Integer, ArrayList<String>> hashMap;
    public static void main(String[] args) {
        ArrayList<String> arrayList_1 = new ArrayList<>();
        Collections.addAll(arrayList_1,"张三","01","语文","60","数学","70","英语","88");
        ArrayList<String> arrayList_2 = new ArrayList<>();
        Collections.addAll(arrayList_2,"李四","02","语文","65","数学","73","英语","98");
        ArrayList<String> arrayList_3 = new ArrayList<>();
        Collections.addAll(arrayList_3,"王五","03","语文","22","数学","23","英语","24");
        ArrayList<String> arrayList_4 = new ArrayList<>();
        Collections.addAll(arrayList_4,"赵六","04","语文","23","数学","22","英语","40");
        ArrayList<String> arrayList_5 = new ArrayList<>();
        Collections.addAll(arrayList_5,"孙七","05","语文","80","数学","88","英语","28");
        ArrayList<String> arrayList_6 = new ArrayList<>();
        Collections.addAll(arrayList_6,"周八","06","语文","33","数学","44","英语","55");
        ArrayList<String> arrayList_7 = new ArrayList<>();
        Collections.addAll(arrayList_7,"吴九","07","语文","83","数学","18","英语","28");
        ArrayList<String> arrayList_8 = new ArrayList<>();
        Collections.addAll(arrayList_8,"郑十","08","语文","24","数学","25","英语","55");
        ArrayList<String> arrayList_9 = new ArrayList<>();
        Collections.addAll(arrayList_9,"十一","09","语文","42","数学","66","英语","42");
        ArrayList<String> arrayList_10 = new ArrayList<>();
        Collections.addAll(arrayList_10,"十二","10","语文","82","数学","82","英语","22");
        ArrayList<String> arrayList_11 = new ArrayList<>();
        Collections.addAll(arrayList_11,"十三","11","语文","65","数学","67","英语","88");
        ArrayList<String> arrayList_12 = new ArrayList<>();
        Collections.addAll(arrayList_12,"十二","12","语文","82","数学","82","英语","71");
        ArrayList<String> arrayList_13 = new ArrayList<>();
        Collections.addAll(arrayList_13,"十三","13","语文","65","数学","67","英语","88");
        ArrayList<String> arrayList_14 = new ArrayList<>();
        Collections.addAll(arrayList_14,"十四","14","语文","82","数学","82","英语","25");
        ArrayList<String> arrayList_15 = new ArrayList<>();
        Collections.addAll(arrayList_15,"十五","15","语文","65","数学","67","英语","98");
        ArrayList<String> arrayList_16 = new ArrayList<>();
        Collections.addAll(arrayList_16,"十六","16","语文","82","数学","85","英语","22");
        ArrayList<String> arrayList_17 = new ArrayList<>();
        Collections.addAll(arrayList_17,"十七","17","语文","65","数学","67","英语","28");
        ArrayList<String> arrayList_18 = new ArrayList<>();
        Collections.addAll(arrayList_18,"十八","18","语文","82","数学","82","英语","66");
        ArrayList<String> arrayList_19 = new ArrayList<>();
        Collections.addAll(arrayList_19,"十九","19","语文","66","数学","37","英语","88");
        ArrayList<String> arrayList_20 = new ArrayList<>();
        Collections.addAll(arrayList_20,"二十","20","语文","69","数学","67","英语","100");
        hashMap = new HashMap<>();
        hashMap.put(1,arrayList_1);
        hashMap.put(2,arrayList_2);
        hashMap.put(3,arrayList_3);
        hashMap.put(4,arrayList_4);
        hashMap.put(5,arrayList_5);
        hashMap.put(6,arrayList_6);
        hashMap.put(7,arrayList_7);
        hashMap.put(8,arrayList_8);
        hashMap.put(9,arrayList_9);
        hashMap.put(10,arrayList_10);
        hashMap.put(11,arrayList_11);
        hashMap.put(12,arrayList_12);
        hashMap.put(13,arrayList_13);
        hashMap.put(14,arrayList_14);
       hashMap.put(15,arrayList_15);
       hashMap.put(16,arrayList_16);
       hashMap.put(17,arrayList_17);
       hashMap.put(18,arrayList_18);
       hashMap.put(19,arrayList_19);
       hashMap.put(20,arrayList_20);

        meum();
    }
    /**
     * @description  传入key,格式化打印信息
     * @param key:
     * @return void
     */
    public static void printlnMessage(int key){
        ArrayList<String> list = hashMap.get(key);
        System.out.println("学号:"+key+" 姓名："+list.get(0)+" 序号："+list.get(1)
                +" 课程名称: "+list.get(2)+" 成绩 "+list.get(3)+" 课程名称: "+list.get(4)+" 成绩 "+list.get(5)+" 课程名称: "+list.get(6)+" 成绩 "+list.get(7));
    }

    public static void show(){
        for (Integer key : hashMap.keySet()) {
            printlnMessage(key);
        }
    }
    //根据学号返回学生信息
    public static void showOneStudent(int key){
        printlnMessage(key);
    }

   //添加学生信息
    public static void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的学号,姓名,序号,语文成绩,数学成绩,英语成绩");
        ArrayList<String> insertArrayList = new ArrayList<>();
        int num = scanner.nextInt();
        //判断是否存在学生信息
        if (hashMap.containsKey(num)){
            System.out.println("已存在学生信息，请修改 ！！");
            return;
        }
        String name = scanner.next();
        String  orderNum= scanner.next();
        String  chinese= scanner.next();
        String  math= scanner.next();
        String  english= scanner.next();
        Collections.addAll(insertArrayList,name,orderNum,"语文",chinese,"数学",math,"英语",english);
        hashMap.put(num,insertArrayList);
        if (hashMap.containsKey(num)){
            System.out.println("已经添加成功");
            printlnMessage(num);
        }
    }

    public static void delete(){
        System.out.println("请输入要删除的学号");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        hashMap.remove(key);
        if (!hashMap.containsKey(key)){
            System.out.println("删除成功");
        }
    }
    //统计课程最大值，最小值，平均值
    public static void count(){
        System.out.println("请输入要统计的课程名称 3.语文成绩  5.数学成绩  7.英语成绩");
        int scanClassNum = new Scanner(System.in).nextInt();
        //初始化maxScore,minScore,计数器，累加器
        int count=0;
        int sum=0;
        int maxScore=0;
        String firstValue=hashMap.get(1).get(scanClassNum);
        int minScore = Integer.valueOf(firstValue);

        //判断
        for (Integer key : hashMap.keySet()) {
            ArrayList<String> list = hashMap.get(key);
            String s1 = list.get(scanClassNum);
            int classSore = Integer.valueOf(s1);
            if (maxScore<=classSore){
                maxScore=classSore;
            }
            if (minScore>=classSore){
                minScore=classSore;
            }
            sum+=classSore;
            count++;
        }
        System.out.println("平均分是  "+sum/count);
        System.out.println("最大分数是" +maxScore);
        System.out.println("最小分数是" +minScore);
    }
    public static void alter(){
        //死循环，可进行重复修改
        while (true){
        System.out.println("请输入要修改的学号，0.推出");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num==0) break;
        ArrayList<String> arrayList = hashMap.get(num);
        System.out.println("你要修改的是？  1.姓名 2.序号 3.语文成绩 4.数学成绩 5.英语成绩 ");
        int alterNum= scanner.nextInt();
        System.out.println("修改为多少");
        String alterValue = scanner.next();
        switch (alterNum){
            case 1:
                arrayList.remove(0);
                arrayList.add(0,alterValue);
                break;
            case 2:
                arrayList.remove(1);
                arrayList.add(1,alterValue);
                break;
            case 3:
                arrayList.remove(3);
                arrayList.add(3,alterValue);
                break;
            case 4:
                arrayList.remove(5);
                arrayList.add(5,alterValue);
                break;
            case 5:
                arrayList.remove(7);
                arrayList.add(7,alterValue);
                break;
        }
            System.out.println("修改后=======================");
            printlnMessage(num);
        }
    }
    public static void sort(){
        System.out.println("按照什么降序排序（3.语文成绩  5.数学成绩  7.英语成绩）");
        int chooseClassNum = new Scanner(System.in).nextInt();
        //假如是语文成绩排序，arr.get(3)
        HashMap hashMap_tmp = new HashMap<>();
        for (Integer key : hashMap.keySet()) {
            ArrayList<String> list = hashMap.get(key);
            //把学号，和指定成绩放在一个hashmap里,便于操作
            hashMap_tmp.put(key,Integer.valueOf(list.get(chooseClassNum)));
        }
        //对value进行排序
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap_tmp.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        //输出排序后信息
        for (Map.Entry<Integer, Integer> integerIntegerEntry : list) {
            printlnMessage(integerIntegerEntry.getKey());
        }

    }
    public static void meum() {
        System.out.println("===================================");
        System.out.println("       欢迎来到学生管理系统");
        while(true){
            System.out.println("===================================");
            System.out.println("           请输入");
            System.out.println("           0.退出");
            System.out.println("       1.查看所有学生信息");
            System.out.println("       2.查看单个学生信息");
            System.out.println("       3.添加单个学生信息");
            System.out.println("       4.删除单个学生信息");
            System.out.println("       5.修改单个学生信息");
            System.out.println("       6.统计单科学生信息");
            System.out.println("       7.排序单科学生成绩");
            System.out.println("===================================");
            int chooseNum = new Scanner(System.in).nextInt();
            if(chooseNum==0)break;
            switch (chooseNum){
                case 1: show();break;
                case 2:
                    System.out.println("请输入一个学生的学号");
                    int key = new Scanner(System.in).nextInt();
                    showOneStudent(key);break;
                case 3: add();break;
                case 4: delete();break;
                case 5: alter();break;
                case 6: count();break;
                case 7:sort(); break;
                default:
                    System.out.println("干神魔啊");
            }
        }
    }
}
