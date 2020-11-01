#include <stdio.h>
#include <math.h>
#define max 3
typedef enum{false,true} boolean;
struct stack{
    int top;
    char entry[max]
}s;
void createStack(struct stack *s){
    s->top = -1;
}

boolean IsStackEmpty(struct stack* s){
    return (s->top==-1);
}
boolean IsStackFull(struct stack* s){
    return (s->top==max-1);
}
void peek(struct stack* s){
    printf("%c is top\n", s->entry[s->top]);
}

void display(struct stack *s){
    for(int i=0; i<=(s->top); i++){
        printf("%c ", s->entry[i]);
    }
}


void push(char c, struct stack *s){
    if(IsStackFull(&s))
        printf("stack is full\n");
    else{
        s->entry[++(s->top)] = c;

    }
}
void pop(struct stack* s){
    if(IsStackEmpty(&s))
        printf("stack is empty\n");
    else{
        printf("\n%c is out\n", s->entry[s->top]);
        s->top--;
    }
}

int main() {
    int option;
    char num;
    createStack(&s);

    do{
        printf("1-push 2-pop 3-peek 4-display 5-exit\nenter: ");
        scanf("%d", &option);

        switch(option){
    case 1:
        printf("enter the word: ");
        scanf("%c", &num);
        push(num, &s);
        break;
    case 2:
        pop(&s);
        break;
    case 3:
        peek(&s);
        break;
    case 4:
        display(&s);
        break;

        }
    }while(option!=5);

    printf("\nyou are exit");


    return 0;
}




