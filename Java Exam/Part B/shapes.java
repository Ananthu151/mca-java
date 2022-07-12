 class shape{
   void print_shape(){
        System.out.println("This is a shape!");
    }
}
    class rectangle extends shape{
        void print_rect(){
            System.out.println("This is rectangle! ");
        }
    }
    class circle extends shape{
        void print_circle(){
            System.out.println("This is circle! ");
        }
    }
    class square extends rectangle{
        void print_square(){
            System.out.println("Square is a rectangle");
        }
    }
    
    class shapes{
        public static void main(String[] args){
            square sq=new square();
            sq.print_shape();
            sq.print_rect();
        }
    }
