package uz.xsoft.messagehelper

import android.content.Context
import android.widget.Toast

object MessageHelper {
    fun showMessage(context:Context, message:String){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }
}