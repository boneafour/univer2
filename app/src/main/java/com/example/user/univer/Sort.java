package com.example.user.univer;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.Html;
import android.widget.Toast;

public class Sort extends DialogFragment {
	@Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

		final String[] languages = getResources().getStringArray(R.array.languages);
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity(), R.style.YourDialogStyle)
        .setTitle(R.string.alert_dialog_title)
		.setItems(R.array.languages, new OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(getActivity(), languages[which], Toast.LENGTH_SHORT).show();
			}
		});
		AlertDialog dialog = alertDialogBuilder.create();
		dialog.getWindow().setBackgroundDrawableResource(R.color.colorBackground);
		dialog.getWindow().setTitleColor(getResources().getColor(R.color.colorText));
		return dialog;
	}
}
