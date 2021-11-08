package net.maribat.printerdemo;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;

import com.android.print.sdk.PrinterInstance;

public class testInstance extends PrinterInstance {
    public testInstance(Context context, BluetoothDevice bluetoothDevice, Handler handler) {
        super(context, bluetoothDevice, handler);
    }


}
