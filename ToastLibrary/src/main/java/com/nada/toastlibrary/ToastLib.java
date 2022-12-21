package com.nada.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastLib {

    public static void showTestLib(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
