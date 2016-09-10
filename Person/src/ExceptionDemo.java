/**
 * Created by fish-Xiang on 2016/9/10.
 */

public class ExceptionDemo {

    class MyException extends Exception {
        private int id;

        public MyException(String message, int id) {
            super(message);
            this.id = id;
        }

        public int getId() {
            return id;
        }
    }


    public void regist(int num) throws MyException {
        if (num < 0) {
            throw new MyException("人数为负值，不合理", 3);
        }
        System.out.println("登记人数 " + num);
    }
    public void manager() {
        try {
            regist(100);
        }catch(MyException e){
            System.out.println("登记失败， 出错类型码=" + e.getId());
            e.printStackTrace();
        }
        System.out.println("操作结束");
    }

    public static void main(String[] args) {
        ExceptionDemo ed = new ExceptionDemo();
        ed.manager();
    }
}

