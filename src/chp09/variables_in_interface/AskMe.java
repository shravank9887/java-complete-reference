package chp09.variables_in_interface;

class AskMe implements SharedConstants{

    static void answer(int result) {
        switch(result){
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;
        }
    }
    // Variables from Interface are available here implicitly
    public static void main(String[] args) {
        Question q = new Question();

        int call_1 = q.ask();
        System.out.println("call_1 q.ask(): " + call_1);
        answer(call_1);
        int call_2 = q.ask();
        System.out.println("call_2 q.ask(): " + call_2);
        answer(call_2);
        int call_3 = q.ask();
        System.out.println("call_3 q.ask(): " + call_3);
        answer(call_3);
        int call_4 = q.ask();
        System.out.println("call_4 q.ask(): " + call_4);
        answer(call_4);
    }
}
