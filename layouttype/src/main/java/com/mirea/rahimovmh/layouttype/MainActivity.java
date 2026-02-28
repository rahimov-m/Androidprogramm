package com.mirea.rahimovmh.layouttype;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Объявляем переменные для элементов экрана
    private TextView tvOut;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация (находим элементы по id с помощью findViewById)
        tvOut = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        checkBox = findViewById(R.id.checkBox);


        // Создаём объект-слушатель для кнопки WhoAmI
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Что происходит при нажатии на WhoAmI
                tvOut.setText("Продолжить изучение программирования?"); // Меняем текст
                checkBox.setChecked(true); // Отмечаем чекбокс
            }
        };
        // Прикрепляем слушатель к кнопке
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }


    // Этот метод будет вызван при нажатии на кнопку ItIsNotMe
    public void onItIsNotMeClick(View view) {
        tvOut.setText("А почему не хочешь?"); // Меняем текст
        checkBox.setChecked(false); // Снимаем отметку с чекбокса
    }
}