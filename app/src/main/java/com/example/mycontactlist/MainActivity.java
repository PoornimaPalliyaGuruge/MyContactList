package com.example.mycontactlist;

import static android.provider.ContactsContract.CommonDataKinds.*;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {

    private static final int RESULT_PICK_CONTACT = 1;
    private TextView phone;
    private TextView type;
    private Button select;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone = findViewById (R.id.phone);
        select = findViewById(R.id.select);
        type = findViewById(R.id.type);

        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_PICK, Phone.CONTENT_URI);
                startActivityForResult(in,RESULT_PICK_CONTACT);

            }
        });

    }
    private static final String[] PROJECTION =
            {
                    ContactsContract.Data._ID,
                    ContactsContract.Data.MIMETYPE,
                    ContactsContract.Data.DATA1,
                    ContactsContract.Data.DATA2,
                    ContactsContract.Data.DATA3,
                    ContactsContract.Data.DATA4,
                    ContactsContract.Data.DATA5,
                    ContactsContract.Data.DATA6,
                    ContactsContract.Data.DATA7,
                    ContactsContract.Data.DATA8,
                    ContactsContract.Data.DATA9,
                    ContactsContract.Data.DATA10,
                    ContactsContract.Data.DATA11,
                    ContactsContract.Data.DATA12,
                    ContactsContract.Data.DATA13,
                    ContactsContract.Data.DATA14,
                    ContactsContract.Data.DATA15
            };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case RESULT_PICK_CONTACT:
                    contactPicked(data);
                    break;
            }
        } else {
            Toast.makeText(this, "Failed To Pick Contact", Toast.LENGTH_SHORT).show();
        }
    }

    private void contactPicked(Intent data){
        Cursor cursor;
        try
        {
            String phoneNo = null;
            String phoneType = null;

            Uri uri = data.getData();
            cursor = getContentResolver().query(uri,null,null,null,null);
            cursor.moveToFirst();
            //int ContactType = cursor.getColumnIndex(Phone.CONTACT_STATUS);
            //phoneType = cursor.getString(Integer.parseInt((Phone.)));

            int phoneIndex1 = cursor.getColumnIndex(Phone.DATA1);
            int phoneIndex2= cursor.getColumnIndex(Phone.DATA2);
            int phoneIndex3= cursor.getColumnIndex(Phone.DATA3);
            int phoneIndex4= cursor.getColumnIndex(Phone.DATA4);
            int phoneIndex5= cursor.getColumnIndex(Phone.DATA5);
            int phoneIndex6= cursor.getColumnIndex(Phone.DATA6);
            int phoneIndex7= cursor.getColumnIndex(Phone.DATA7);
            int phoneIndex8= cursor.getColumnIndex(Phone.DATA8);
            int phoneIndex9= cursor.getColumnIndex(Phone.DATA9);
            int phoneIndex10= cursor.getColumnIndex(Phone.DATA10);
            int phoneIndex11= cursor.getColumnIndex(Phone.DATA11);
            int phoneIndex12= cursor.getColumnIndex(Phone.DATA12);
            int phoneIndex13= cursor.getColumnIndex(Phone.DATA13);
            int phoneIndex14= cursor.getColumnIndex(Phone.DATA14);
            int phoneIndex15= cursor.getColumnIndex(Phone.DATA15);
            int phoneIndexM= cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.MIMETYPE);
            int ContactID= cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.CONTACT_ID);
            int ContactName= cursor.getColumnIndex(Phone.DISPLAY_NAME);
            int ContactNumber= cursor.getColumnIndex(Phone.NUMBER);
            int ContactType= cursor.getColumnIndex(Phone.CONTACT_STATUS_LABEL);
            int ContactLabel= cursor.getColumnIndex(Phone.LABEL);
            int ContactNameId= cursor.getColumnIndex(Phone.NAME_RAW_CONTACT_ID);
            int LookUpKey= cursor.getColumnIndex(Phone.LOOKUP_KEY);
            int ItemType= cursor.getColumnIndex(Phone.CONTENT_ITEM_TYPE);
            int ContactStatus= cursor.getColumnIndex(Phone.CONTACT_STATUS);
            int DATA1= cursor.getColumnIndex(ContactsContract.Data.DATA1);
            int DATA3= cursor.getColumnIndex(ContactsContract.Data.DATA3);
            int D= cursor.getColumnIndex(ContactsContract.CommonDataKinds.Email.ADDRESS);
            int Type= cursor.getColumnIndex(Phone.TYPE);
            int CONTACT_CHAT_CAPABILITY= cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.CONTACT_CHAT_CAPABILITY);
            int CONTACT_PRESENCE= cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.CONTACT_PRESENCE);
            int CONTACT_STATUS= cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.CONTACT_STATUS);
            int CONTACT_STATUS_ICON= cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.CONTACT_STATUS_ICON);
            int CONTACT_STATUS_LABEL= cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.CONTACT_STATUS_LABEL);
            int CONTACT_STATUS_RES_PACKAGE= cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.CONTACT_STATUS_RES_PACKAGE);
            int CONTACT_STATUS_TIMESTAMP= cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.CONTACT_STATUS_TIMESTAMP);
            int CONTACT_Type= cursor.getColumnIndex(Phone.CONTENT_TYPE);



            phoneNo = cursor.getString(phoneIndex1);

            Log.d("TAG1", "contactPicked: "+cursor.getString(phoneIndex1));
            Log.d("TAG2", "contactPicked: "+cursor.getString(phoneIndex2));
            Log.d("TAG3", "contactPicked: "+cursor.getString(phoneIndex3));
            Log.d("TAG4", "contactPicked: "+cursor.getString(phoneIndex4));
            Log.d("TAG5", "contactPicked: "+cursor.getString(phoneIndex5));
            Log.d("TAG6", "contactPicked: "+cursor.getString(phoneIndex6));
            Log.d("TAG7", "contactPicked: "+cursor.getString(phoneIndex7));
            Log.d("TAG8", "contactPicked: "+cursor.getString(phoneIndex8));
            Log.d("TAG9", "contactPicked: "+cursor.getString(phoneIndex9));
            Log.d("TAG10", "contactPicked: "+cursor.getString(phoneIndex10));
            Log.d("TAG11", "contactPicked: "+cursor.getString(phoneIndex11));
            Log.d("TAG12", "contactPicked: "+cursor.getString(phoneIndex12));
            Log.d("TAG13", "contactPicked: "+cursor.getString(phoneIndex13));
            Log.d("TAG14", "contactPicked: "+cursor.getString(phoneIndex14));
            Log.d("TAG15", "contactPicked: "+cursor.getString(phoneIndex15));
            Log.d("TAG16", "contactPicked: "+cursor.getString(phoneIndexM));
            Log.d("TAG17", "contactPicked: "+cursor.getString(ContactID));
            Log.d("TAG18", "contactPicked: "+cursor.getString(ContactName));
            Log.d("TAG19", "contactPicked: "+cursor.getString(ContactNumber));
            Log.d("TAG20", "contactPicked: "+cursor.getString(ContactType));
            Log.d("TAG21", "contactPicked: "+cursor.getString(ContactLabel));
            Log.d("TAG22", "contactPicked: "+cursor.getString(ContactNameId));
            Log.d("TAG23", "contactPicked: "+cursor.getString(DATA1));
            Log.d("TAG24", "contactPicked: "+cursor.getString(DATA3));
            Log.d("TAG26", "contactPicked: "+cursor.getString(D));
            Log.d("TAG27", "contactPicked: "+cursor.getString(CONTACT_CHAT_CAPABILITY));
            Log.d("TAG28", "contactPicked: "+cursor.getString(CONTACT_PRESENCE));
            Log.d("TAG29", "contactPicked: "+cursor.getString(CONTACT_STATUS));
            Log.d("TAG30", "contactPicked: "+cursor.getString(CONTACT_STATUS_ICON));
            Log.d("TAG31", "contactPicked: "+cursor.getString(CONTACT_STATUS_LABEL));
            Log.d("TAG32", "contactPicked: "+cursor.getString(CONTACT_STATUS_RES_PACKAGE));
            Log.d("TAG33", "contactPicked: "+cursor.getString(CONTACT_STATUS_TIMESTAMP));
            Log.d("TAG34", "contactPicked: "+cursor.getString(CONTACT_Type));
            Log.d("TAG50", "contactPicked: "+cursor.getString(Type));

            //Log.d("TAG23", "contactPicked: "+cursor.getString(LookUpKey));

            Log.d("TAG25", "contactPicked: "+cursor.getString(ContactStatus));
            Log.d("TAG34", "contactPicked: "+cursor.getString(ItemType));
            Log.d("TAG", "contactPicked: "+cursor);

            phone.setText(phoneNo);
            type.setText(ContactType);

        }
        catch(Exception e){

        }
    }
}