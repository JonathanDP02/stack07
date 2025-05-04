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

    public surat07 pop(){
        if(!isEmpty()){
            surat07 m = stack[top];
            top--;
            return m;
        }else{
            System.out.println("Stack kosong! Tidak ada surat untuk verifikasi.");
            return null;
        }
    }

    public surat07 peek(){
        if(!isEmpty()){
            return stack[top];
        }else{
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan");
            return null;
        }
    }

    public boolean cariSurat(String nama){
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}
