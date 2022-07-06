package space.rybakov.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action){
            ACTION_CLICKED -> {
                Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
            }
            Intent.ACTION_BATTERY_LOW -> {
                Toast.makeText(context, "Battery low", Toast.LENGTH_SHORT).show()
            }
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                val turnOn= intent.getBooleanExtra("state", false)
                Toast.makeText(
                    context,
                    "Airplane mode changed. TurnedOn: $turnOn",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
    }

    companion object {
        const val ACTION_CLICKED = "clicked"
    }
}