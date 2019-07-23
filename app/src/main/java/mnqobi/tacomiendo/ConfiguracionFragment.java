package mnqobi.tacomiendo;


import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ConfiguracionFragment extends Fragment {

    AlertDialog alertDialog;
    private Button btn_fre;
    int op=0;


    public ConfiguracionFragment() {
        // Required empty public constructor
    }


    @SuppressLint("ResourceAsColor")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View configuracion =  inflater.inflate(R.layout.fragment_configuracion, container, false);
        btn_fre = configuracion.findViewById(R.id.btn_frecuencia);
        btn_fre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final CharSequence[] frecu ={"Un correo diario","Un correo a la semana","Un correo al mes","No quiero recibir corrreos"};
                final AlertDialog.Builder builder;
                builder = new AlertDialog.Builder(configuracion.getContext());
                builder.setTitle("Frecuencia de notificaciones por correo");
                builder
                        .setCancelable(false)
                        .setSingleChoiceItems(frecu,op, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int item) {
                                switch (item){
                                    case 0:
                                        op=item;
                                        btn_fre.setText("Frecuencia de notificaciones por correo \n\n"+ "Un correo diario");
                                        break;
                                    case 1:
                                        op=item;
                                        btn_fre.setText("Frecuencia de notificaciones por correo \n\n"+ "Un correo a la semana");
                                        break;
                                    case 2:
                                        op=item;
                                        btn_fre.setText("Frecuencia de notificaciones por correo \n\n"+ "Un correo al mes");
                                        break;
                                    case 3:
                                        op=item;
                                        btn_fre.setText("Frecuencia de notificaciones por correo \n\n"+ "No quiero recibir correos");
                                        break;
                                }
                                alertDialog.dismiss();
                            }
                        });
                alertDialog = builder.create();
                alertDialog.show();
            }
        });




        return configuracion;
    }

}
