#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node* link;
};

void add(struct node** head, int data){
    struct node *ptr = (struct node*)malloc(sizeof(struct node)), *temp = *head;
    ptr->data = data;
    ptr->link = NULL;
    if(temp==NULL){
        *head = ptr;
    }
    else{
        while(temp->link != NULL){
            temp = temp->link;
        }
        temp->link = ptr;
    }
}

void del_pos(struct node** head, int pos){

    struct node *pervious = *head;
    struct node *current = *head;
    if( *head = NULL)
        printf("list is already empty\n");
    else if( pos == 1){
        *head = current->link;
        free(current);
        current = NULL;
    }
    else{
        while(pos != 1){
            pervious = current;
            current = current->link;
            pos--;
        }
        pervious->link = current->link;
        free(current);
        current = NULL;
    }

}

void display(struct node* head){
    struct node* ptr = head;
    while(ptr != NULL){
        printf("%d ", ptr->data);
        ptr = ptr->link;
    }
    printf("\n");


}




int main(){
    struct node* head = NULL;


    add(&head, 46);
    add(&head, 47);
    add(&head, 48);
    add(&head, 49);
    display(head);

    del_pos(&head,2);
    display(head);
    add(&head, 50);
    add(&head, 51);

    display(head);

    return 0;
}
