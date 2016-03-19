package com.example.android.thetorchcoffe;

import android.app.Application;

/**
 * Created by neto6 on 19/03/2016.
 *
 */
public class GlobalPrice extends Application {
    int price;
    boolean hasIcecream = false; //Variable Boolean False hasIcecream
    boolean hasCoffe = false;    //Variable Boolean False hasCoffe
    boolean hasWine = false;    //Variable Boolean False hasWine

    //setHasIcecream on @param has this have one Context
    public void setHasIcecream(boolean has){ this.hasIcecream = has; }
    //setHasCoffe on @param has this have one Context
    public void setHasCoffe(boolean has){ this.hasCoffe = has; }
    //setHasWineon @param has this have one Context
    public void setHasWine (boolean has){ this.hasWine = has; }

    // Have Encapsulate Price for have, from this variable Price perform  on test logic the hasCoffe,hasIcecream,hasWine. Because
    //this values for True return the valor from SixthView
    public int getPrice(){
        price = 0;
        if(hasCoffe){
            price += 5;
        }
        if(hasIcecream){
            price += 12;
        }
        if (hasWine){
            price += 32;
        }
        return price;
    }
}
