"Functional Programming in JAVA"

A method needs 4 things name ,return  type , input parameters and body

int doStuff(int a){ 
 do stuff 
 return c; 
}

to implement SAM (single abstract method ) we don't need name,
as we will be referring to only one method ,
return type can always be inferred from body
whether we are returning anything and what is its type
so the above method can also be written as
(int a)->{ do stuff return c;}

this is nothing but lambda expression,
it can only be employed for SAM (single abstract method )
we will also go with difference between SAM and anonymous class.

    