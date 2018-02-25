package com.usjt.meuprimeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**Constante static para identificar a mensagem.

     * @author Victor Ferreira dos Santos - 201516754

     */
    public final static String EXTRA_MESSAGE = "com.usjt.meuprimeiroapp.MESSAGE";

    /**Metodo que será chamado quando o usuário clicar em Enviar.

     * @author Victor Ferreira dos Santos - 201516754

     */
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
