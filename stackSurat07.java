public class stackSurat07 {
    surat07[] stack;
    int top;
    int size;

    public stackSurat07(int size){
        this.size = size;
        stack = new surat07[size];
        top = -1;
    }

    public boolean isFull(){
        if(top==size-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

    public void push(surat07 mhs){
        if(!isFull()){
            top++;
            stack[top] = mhs;
        }else{
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi");
        }
    }

    
}
