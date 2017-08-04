package lianxi.linkedlist;

/*
 * 单向循环链表形成约瑟环
 */
public class Main
{

    public static void main(String[] args)
    {
        int N=9;//这个表示总人数
        int M=5;//数到几的人出列
        Node t=new Node(1);//头节点单列出来，方便形成循环链表
        Node x=t;

        for(int i=2;i<=N;i++)
            x=(x.next=new Node(i));//建立单向链表
        x.next=t;//最后一个节点的next指向第一个节点，形成循环链表

        System.out.println("出圈的顺序为：");
        while(x!=x.next){
            for(int i=1;i<M;i++)
                x=x.next;  //此时x是将出列的节点的前一个节点
            System.out.print(x.next.getValue()+" ");
            x.next=x.next.next;
        }
        System.out.println();
        System.out.println("Survivors is "+x.getValue());  
}
}
  //定义结点
    class Node{
        Object value;   //节点数据
        Node next;  //单向链表指向下一个节点
        public Node(Object v){
            this.value = v;
        }

        public void setValue(Object v){
           this.value = v; 
        }
        public Object getValue(){
            return this.value;
        }

        public void setNext(Node node){
            this.next = node;
        }

        public Node getNex(){
            return next;
        }
    }
