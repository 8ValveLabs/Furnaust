package com.programax.furnaust;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class PickerDialog extends DialogFragment {

    PickerDialogListener listener;

    public interface PickerDialogListener {
        public void onPickLarge(DialogFragment dialog);
        public void onPickSmall(DialogFragment dialog);
        public void onPickRefinery(DialogFragment dialog);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listener = (PickerDialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException("Activity must implement PickerDialogListener");
        }
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.change_layout_button_label)
                .setItems(R.array.list_furnace_types, (dialog, which) -> {
                    switch (which) {
                        case 0:
                            listener.onPickSmall(PickerDialog.this);
                            break;
                        case 1:
                            listener.onPickLarge(PickerDialog.this);
                            break;
                        case 2:
                            listener.onPickRefinery(PickerDialog.this);
                            break;
                        default:
                            break;
                    }
                });
        return builder.create();
    }
}
