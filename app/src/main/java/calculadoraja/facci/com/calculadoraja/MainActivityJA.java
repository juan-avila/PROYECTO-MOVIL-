package calculadoraja.facci.com.calculadoraja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityJA extends AppCompatActivity {

    Button  btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnpunto,btnsuma,btnresta,btnmultiplicacion,btndivicion,btnigual,btnlimpiar,btnabout;
    private EditText pantalla;
    String pantalla1;
    double valor1=0,valor2=0 ,resultado=0;
    int operacion=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_j);


        pantalla=(EditText)findViewById(R.id.ETpantalla);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.bnt2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnpunto=(Button)findViewById(R.id.btnpunto);
        btnsuma=(Button)findViewById(R.id.btnsuma);
        btnresta=(Button)findViewById(R.id.btnresta);
        btnmultiplicacion=(Button)findViewById(R.id.btnmultipliccion);
        btndivicion=(Button)findViewById(R.id.btndivicion);
        btnigual=(Button)findViewById(R.id.btnigual);
        btnlimpiar=(Button)findViewById(R.id.btnlimpiar);

        btn0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton0();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton1();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton2();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton3();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton4();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton5();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton6();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton7();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton8();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton9();
            }
        });

        btnpunto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                botonpunto();
            }
        });

        btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botonigual();
            }
        });

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botonsuma();
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botonresta();
            }
        });

        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botonmultiplicacion();
            }
        });

        btndivicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botondivision();
            }
        });

        btnlimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText("");
            }
        });

        /*btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivityJA.this, AcercaJA.class));
            }
        });*/




    }

    public void boton0() {
        try {
            pantalla1 = pantalla.getText().toString();
            if (pantalla1.equalsIgnoreCase("0") == false)
            {
                pantalla1 = pantalla1 + "0";
            }
            pantalla.setText(pantalla1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void botonpunto() {
        try {
            pantalla1 = pantalla.getText().toString();
            if (pantalla1.equalsIgnoreCase("0") == false)
            {
                pantalla1 = pantalla1 + ".";
            }
            pantalla.setText(pantalla1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton1() {
        try {
            pantalla1 = pantalla.getText().toString();
            if (pantalla1.equalsIgnoreCase("0") == false)
            {
                pantalla1 = pantalla1 + "1";
            }
            pantalla.setText(pantalla1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton2() {
        try {
            pantalla1 = pantalla.getText().toString();
            if (pantalla1.equalsIgnoreCase("0") == false)
            {
                pantalla1 = pantalla1 + "2";
            }
            pantalla.setText(pantalla1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton3() {
        try {
            pantalla1 = pantalla.getText().toString();
            if (pantalla1.equalsIgnoreCase("0") == false)
            {
                pantalla1 = pantalla1 + "3";
            }
            pantalla.setText(pantalla1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton4(){
            try {
                pantalla1 = pantalla.getText().toString();
                if (pantalla1.equalsIgnoreCase("0") == false)
                {
                    pantalla1 = pantalla1 + "4";
                }
                pantalla.setText(pantalla1);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }

    public void boton5() {
        try {
             pantalla1 = pantalla.getText().toString();
            if (pantalla1.equalsIgnoreCase("0") == false)
            {
                pantalla1 = pantalla1 + "5";
            }
            pantalla.setText(pantalla1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton6() {
        try {
            pantalla1 = pantalla.getText().toString();
            if (pantalla1.equalsIgnoreCase("0") == false)
            {
                pantalla1 = pantalla1 + "6";
            }
            pantalla.setText(pantalla1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton7() {
        try {
            pantalla1 = pantalla.getText().toString();
            if (pantalla1.equalsIgnoreCase("0") == false)
            {
                pantalla1 = pantalla1 + "7";
            }
            pantalla.setText(pantalla1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton8() {
        try {
            pantalla1 = pantalla.getText().toString();
            if (pantalla1.equalsIgnoreCase("0") == false)
            {
                pantalla1 = pantalla1 + "8";
            }
            pantalla.setText(pantalla1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void boton9() {
        try {
            pantalla1 = pantalla.getText().toString();
            if (pantalla1.equalsIgnoreCase("0") == false)
            {
                pantalla1 = pantalla1 + "9";
            }
            pantalla.setText(pantalla1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public void botonsuma() {
        try {
            pantalla1 = pantalla.getText().toString();
            valor1 = Double.parseDouble(pantalla1);
            operacion = 1;
            pantalla1 = "";
            pantalla.setText(pantalla1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void botonresta() {
        try {
            pantalla1 = pantalla.getText().toString();
            valor1 = Double.parseDouble(pantalla1);
            operacion = 2;
            pantalla1 = "";
            pantalla.setText(pantalla1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void botonmultiplicacion() {
        try {
            pantalla1 = pantalla.getText().toString();
            valor1 = Double.parseDouble(pantalla1);
            operacion = 3;
            pantalla1 = "";
            pantalla.setText(pantalla1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void botondivision() {
        try {
            pantalla1 = pantalla.getText().toString();
            valor1 = Double.parseDouble(pantalla1);
            operacion = 4;
            pantalla1 = "";
            pantalla.setText(pantalla1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void acerca(View view){

        startActivity(new Intent(MainActivityJA.this, AcercaJA.class));

    }

    public void botonigual() {
        try {
            pantalla = (EditText) findViewById(R.id.ETpantalla);
            pantalla1 = pantalla.getText().toString();
            valor2 = Double.parseDouble(pantalla1);
            switch (operacion)
            {
                case 1:
                    resultado = (valor1 + valor2);
                    break;
                case 2:
                    resultado = (valor1 - valor2);
                    break;
                case 3:
                    resultado = (valor1 * valor2);
                    break;
                case 4:
                    resultado = (valor1 / valor2);
                    break;

            }
            pantalla1 = String.valueOf(resultado  );
            operacion = 0;
            pantalla.setText(pantalla1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
