package com.example.a112121016_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private android.widget.RelativeLayout.LayoutParams layoutParams;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button submit;

    private TextView Text1;
    private TextView editText2;
    private TextView Text3;
    private TextView editText4;
    private TextView Text5;
    private TextView Text6;
    private TextView Text7;
    private TextView Text8;
    private TextView Text9;
    private TextView Text10;
    private TextView Textview1;
    private TextView Textview2;
    private TextView Textview3;
    private TextView Textview4;
    private TextView Textview5;
    private TextView Textview6;
    private TextView Textview7;
    private TextView Textview8;
    private TextView Textview9;
    private TextView Textview10;
    private TextView Textview11;
    private TextView Textview12;
    private TextView Textview13;
    private TextView Textview14;
    private TextView Textview15;
    float xCoordinate,yCoordinate;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Random r = new Random();
        int t1 = r.nextInt(100) + 1;
        int t2 = r.nextInt(100) + 1;
        int t3 = r.nextInt(100) + 1;
        int t4 = r.nextInt(100) + 1;
        int t5 = r.nextInt(100) + 1;
        int b1 = 100 - t1;
        int b8 = t1 - b1;
        int b3 = 100 - t5;
        int b7 = t5 - b3;
        int b2 = t3 * 1;
        int b4 = 1;
        int b9 = t3 + t2;
        int b5 = t3;
        int b10 = t4;
        int b6 = 1;
        String str1 = "";
        int score = 0;
        int life=3;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Textview3 = findViewById(R.id.Textview3);
        Textview6 = findViewById(R.id.Textview6);
        Textview9 = findViewById(R.id.Textview9);
        Textview12 = findViewById(R.id.Textview12);
        Textview15 = findViewById(R.id.Textview15);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        submit = findViewById(R.id.submit);
        Text1 = findViewById(R.id.Text1);
        editText2 = findViewById(R.id.editText2);
        Text3 = findViewById(R.id.Text3);
        editText4 = findViewById(R.id.editText4);
        Text5 = findViewById(R.id.Text5);
        Text6 = findViewById(R.id.Text6);
        Text7 = findViewById(R.id.Text7);
        Text8= findViewById(R.id.Text8);
        Text9= findViewById(R.id.Text9);
        Text10 = findViewById(R.id.Text10);
        Textview3.setText((String.valueOf(t1)));
        Textview6.setText((String.valueOf(t2)));
        Textview9.setText((String.valueOf(t3)));
        Textview12.setText((String.valueOf(t4)));
        Textview15.setText((String.valueOf(t5)));
        button1.setText((String.valueOf(b1)));
        button8.setText((String.valueOf(b8)));
        button3.setText((String.valueOf(b3)));
        button7.setText((String.valueOf(b7)));
        button2.setText((String.valueOf(b2)));
        button4.setText((String.valueOf(b4)));
        button5.setText((String.valueOf(b5)));
        button9.setText((String.valueOf(b9)));
        button4.setText((String.valueOf(b4)));
        button10.setText((String.valueOf(b10)));
        button6.setText((String.valueOf(b6)));
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Fill blanks top to bottom and left to right", Toast.LENGTH_LONG).show();
            }
        });
        Text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text1.setText((String.valueOf(b1)));
                button1.setText(str1);


            }
        });
        editText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText((String.valueOf(b1)));
                button1.setText(str1);


            }
        });
        Text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text3.setText((String.valueOf(b1)));
                button1.setText(str1);


            }
        });
        editText4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText4.setText((String.valueOf(b1)));
                button1.setText(str1);



            }
        });
        Text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text5.setText((String.valueOf(b1)));
                button1.setText(str1);


            }
        });
        Text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text6.setText((String.valueOf(b1)));
                button1.setText(str1);


            }
        });
        Text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text7.setText((String.valueOf(b1)));
                button1.setText(str1);


            }
        });
        Text8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text8.setText((String.valueOf(b1)));
                button1.setText(str1);


            }
        });
        Text9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text9.setText((String.valueOf(b1)));
                button1.setText(str1);


            }
        });
        Text10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text10.setText((String.valueOf(b1)));
                button1.setText(str1);


            }
        });



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                Text1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text1.setText((String.valueOf(b2)));
                        button2.setText(str1);

                    }
                });
                editText2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText2.setText((String.valueOf(b2)));
                        button2.setText(str1);


                    }
                });
                Text3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text3.setText((String.valueOf(b2)));
                        button2.setText(str1);


                    }
                });
                editText4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText4.setText((String.valueOf(b2)));
                        button2.setText(str1);



                    }
                });
                Text5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text5.setText((String.valueOf(b2)));
                        button2.setText(str1);


                    }
                });
                Text6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text6.setText((String.valueOf(b2)));
                        button2.setText(str1);


                    }
                });
                Text7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text7.setText((String.valueOf(b2)));
                        button2.setText(str1);


                    }
                });
                Text8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text8.setText((String.valueOf(b2)));
                        button2.setText(str1);


                    }
                });
                Text9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text9.setText((String.valueOf(b2)));
                        button2.setText(str1);


                    }
                });
                Text10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text10.setText((String.valueOf(b2)));
                        button2.setText(str1);


                    }
                });

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                Text1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text1.setText((String.valueOf(b3)));
                        button3.setText(str1);

                    }
                });
                editText2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText2.setText((String.valueOf(b3)));
                        button3.setText(str1);


                    }
                });
                Text3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text3.setText((String.valueOf(b3)));
                        button3.setText(str1);


                    }
                });
                editText4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText4.setText((String.valueOf(b3)));
                        button3.setText(str1);



                    }
                });
                Text5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text5.setText((String.valueOf(b3)));
                        button3.setText(str1);


                    }
                });
                Text6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text6.setText((String.valueOf(b3)));
                        button3.setText(str1);


                    }
                });
                Text7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text7.setText((String.valueOf(b3)));
                        button3.setText(str1);


                    }
                });
                Text8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text8.setText((String.valueOf(b3)));
                        button3.setText(str1);


                    }
                });
                Text9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text9.setText((String.valueOf(b3)));
                        button3.setText(str1);


                    }
                });
                Text10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text10.setText((String.valueOf(b3)));
                        button3.setText(str1);


                    }
                });


            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                Text1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text1.setText((String.valueOf(b4)));
                        button4.setText(str1);

                    }
                });
                editText2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText2.setText((String.valueOf(b4)));
                        button4.setText(str1);


                    }
                });
                Text3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text3.setText((String.valueOf(b4)));
                        button4.setText(str1);


                    }
                });
                editText4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText4.setText((String.valueOf(b4)));
                        button4.setText(str1);



                    }
                });
                Text5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text5.setText((String.valueOf(b4)));
                        button4.setText(str1);


                    }
                });
                Text6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text6.setText((String.valueOf(b4)));
                        button4.setText(str1);


                    }
                });
                Text7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text7.setText((String.valueOf(b4)));
                        button4.setText(str1);


                    }
                });
                Text8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text8.setText((String.valueOf(b4)));
                        button4.setText(str1);


                    }
                });
                Text9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text9.setText((String.valueOf(b4)));
                        button4.setText(str1);


                    }
                });
                Text10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text10.setText((String.valueOf(b4)));
                        button4.setText(str1);


                    }
                });


            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                Text1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text1.setText((String.valueOf(b5)));
                        button5.setText(str1);

                    }
                });
                editText2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText2.setText((String.valueOf(b5)));
                        button5.setText(str1);


                    }
                });
                Text3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text3.setText((String.valueOf(b5)));
                        button5.setText(str1);


                    }
                });
                editText4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText4.setText((String.valueOf(b5)));
                        button5.setText(str1);



                    }
                });
                Text5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text5.setText((String.valueOf(b5)));
                        button5.setText(str1);


                    }
                });
                Text6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text6.setText((String.valueOf(b5)));
                        button5.setText(str1);


                    }
                });
                Text7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text7.setText((String.valueOf(b5)));
                        button5.setText(str1);


                    }
                });
                Text8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text8.setText((String.valueOf(b5)));
                        button5.setText(str1);


                    }
                });
                Text9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text9.setText((String.valueOf(b5)));
                        button5.setText(str1);


                    }
                });
                Text10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text10.setText((String.valueOf(b5)));
                        button5.setText(str1);


                    }
                });

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                Text1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text1.setText((String.valueOf(b6)));
                        button6.setText(str1);

                    }
                });
                editText2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText2.setText((String.valueOf(b6)));
                        button6.setText(str1);


                    }
                });
                Text3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text3.setText((String.valueOf(b6)));
                        button6.setText(str1);


                    }
                });
                editText4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText4.setText((String.valueOf(b6)));
                        button6.setText(str1);



                    }
                });
                Text5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text5.setText((String.valueOf(b6)));
                        button6.setText(str1);


                    }
                });
                Text6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text6.setText((String.valueOf(b6)));
                        button6.setText(str1);


                    }
                });
                Text7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text7.setText((String.valueOf(b6)));
                        button6.setText(str1);


                    }
                });
                Text8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text8.setText((String.valueOf(b6)));
                        button6.setText(str1);


                    }
                });
                Text9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text9.setText((String.valueOf(b6)));
                        button6.setText(str1);


                    }
                });
                Text10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text10.setText((String.valueOf(b6)));
                        button6.setText(str1);


                    }
                });
                button7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                        Text1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text1.setText((String.valueOf(b7)));
                                button7.setText(str1);

                            }
                        });
                        editText2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText2.setText((String.valueOf(b7)));
                                button7.setText(str1);


                            }
                        });
                        Text3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text3.setText((String.valueOf(b7)));
                                button7.setText(str1);


                            }
                        });
                        editText4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText4.setText((String.valueOf(b7)));
                                button7.setText(str1);



                            }
                        });
                        Text5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text5.setText((String.valueOf(b7)));
                                button7.setText(str1);


                            }
                        });
                        Text6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text6.setText((String.valueOf(b7)));
                                button7.setText(str1);


                            }
                        });
                        Text7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text7.setText((String.valueOf(b7)));
                                button7.setText(str1);


                            }
                        });
                        Text8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text8.setText((String.valueOf(b7)));
                                button7.setText(str1);


                            }
                        });
                        Text9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text9.setText((String.valueOf(b7)));
                                button7.setText(str1);


                            }
                        });
                        Text10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text10.setText((String.valueOf(b7)));
                                button7.setText(str1);


                            }
                        });

                    }
                });


            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                Text1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text1.setText((String.valueOf(b8)));
                        button8.setText(str1);

                    }
                });
                editText2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText2.setText((String.valueOf(b8)));
                        button8.setText(str1);


                    }
                });
                Text3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text3.setText((String.valueOf(b8)));
                        button8.setText(str1);


                    }
                });
                editText4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText4.setText((String.valueOf(b8)));
                        button8.setText(str1);



                    }
                });
                Text5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text5.setText((String.valueOf(b8)));
                        button8.setText(str1);


                    }
                });
                Text6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text6.setText((String.valueOf(b8)));
                        button8.setText(str1);


                    }
                });
                Text7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text7.setText((String.valueOf(b8)));
                        button8.setText(str1);


                    }
                });
                Text8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text8.setText((String.valueOf(b8)));
                        button8.setText(str1);


                    }
                });
                Text9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text9.setText((String.valueOf(b8)));
                        button8.setText(str1);


                    }
                });
                Text10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text10.setText((String.valueOf(b8)));
                        button8.setText(str1);


                    }
                });

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                Text1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text1.setText((String.valueOf(b9)));
                        button9.setText(str1);

                    }
                });
                editText2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText2.setText((String.valueOf(b9)));
                        button9.setText(str1);


                    }
                });
                Text3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text3.setText((String.valueOf(b9)));
                        button9.setText(str1);


                    }
                });
                editText4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText4.setText((String.valueOf(b9)));
                        button9.setText(str1);



                    }
                });
                Text5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text5.setText((String.valueOf(b9)));
                        button9.setText(str1);


                    }
                });
                Text6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text6.setText((String.valueOf(b9)));
                        button9.setText(str1);


                    }
                });
                Text7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text7.setText((String.valueOf(b9)));
                        button9.setText(str1);


                    }
                });
                Text8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text8.setText((String.valueOf(b9)));
                        button9.setText(str1);


                    }
                });
                Text9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text9.setText((String.valueOf(b9)));
                        button9.setText(str1);


                    }
                });
                Text10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text10.setText((String.valueOf(b9)));
                        button9.setText(str1);


                    }
                });

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();

                Text1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text1.setText((String.valueOf(b10)));
                        button10.setText(str1);

                    }
                });
                editText2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText2.setText((String.valueOf(b10)));
                        button10.setText(str1);


                    }
                });
                Text3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text3.setText((String.valueOf(b10)));
                        button10.setText(str1);


                    }
                });
                editText4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editText4.setText((String.valueOf(b10)));
                        button10.setText(str1);



                    }
                });
                Text5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text5.setText((String.valueOf(b10)));
                        button10.setText(str1);


                    }
                });
                Text6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text6.setText((String.valueOf(b10)));
                        button10.setText(str1);


                    }
                });
                Text7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text7.setText((String.valueOf(b10)));
                        button10.setText(str1);


                    }
                });
                Text8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text8.setText((String.valueOf(b10)));
                        button10.setText(str1);


                    }
                });
                Text9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text9.setText((String.valueOf(b10)));
                        button10.setText(str1);


                    }
                });
                Text10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Text10.setText((String.valueOf(b10)));
                        button10.setText(str1);


                    }
                });

            }
        });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Puzzle will be regenerated", Toast.LENGTH_SHORT).show();

                Random r = new Random();
                int t1 = r.nextInt(100) + 1;
                int t2 = r.nextInt(100) + 1;
                int t3 = r.nextInt(100) + 1;
                int t4 = r.nextInt(100) + 1;
                int t5 = r.nextInt(100) + 1;
                int b1 = 100 - t1;
                int b8 = t1 - b1;
                int b3 = 100 - t5;
                int b7 = t5 - b3;
                int b2 = t3 * 1;
                int b4 = 1;
                int b9 = t3 + t2;
                int b5 = t3;
                int b10 = t4;
                int b6 = 1;
                String str1 = "";
                int score = 0;
                int life=3;


                setContentView(R.layout.activity_main);
                Textview3 = findViewById(R.id.Textview3);
                Textview6 = findViewById(R.id.Textview6);
                Textview9 = findViewById(R.id.Textview9);
                Textview12 = findViewById(R.id.Textview12);
                Textview15 = findViewById(R.id.Textview15);
                button1 = findViewById(R.id.button1);
                button2 = findViewById(R.id.button2);
                button3 = findViewById(R.id.button3);
                button4 = findViewById(R.id.button4);
                button5 = findViewById(R.id.button5);
                button6 = findViewById(R.id.button6);
                button7 = findViewById(R.id.button7);
                button8 = findViewById(R.id.button8);
                button9 = findViewById(R.id.button9);
                button10 = findViewById(R.id.button10);
                submit = findViewById(R.id.submit);
                Text1 = findViewById(R.id.Text1);
                editText2 = findViewById(R.id.editText2);
                Text3 = findViewById(R.id.Text3);
                editText4 = findViewById(R.id.editText4);
                Text5 = findViewById(R.id.Text5);
                Text6 = findViewById(R.id.Text6);
                Text7 = findViewById(R.id.Text7);
                Text8= findViewById(R.id.Text8);
                Text9= findViewById(R.id.Text9);
                Text10 = findViewById(R.id.Text10);
                Textview3.setText((String.valueOf(t1)));
                Textview6.setText((String.valueOf(t2)));
                Textview9.setText((String.valueOf(t3)));
                Textview12.setText((String.valueOf(t4)));
                Textview15.setText((String.valueOf(t5)));
                button1.setText((String.valueOf(b1)));
                button8.setText((String.valueOf(b8)));
                button3.setText((String.valueOf(b3)));
                button7.setText((String.valueOf(b7)));
                button2.setText((String.valueOf(b2)));
                button4.setText((String.valueOf(b4)));
                button5.setText((String.valueOf(b5)));
                button9.setText((String.valueOf(b9)));
                button4.setText((String.valueOf(b4)));
                button10.setText((String.valueOf(b10)));
                button6.setText((String.valueOf(b6)));


                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                        Toast.makeText(MainActivity.this, "Fill blanks top to bottom and left to right", Toast.LENGTH_LONG).show();
                        Text1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text1.setText((String.valueOf(b1)));
                                button1.setText(str1);


                            }
                        });
                        editText2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText2.setText((String.valueOf(b1)));
                                button1.setText(str1);


                            }
                        });
                        Text3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text3.setText((String.valueOf(b1)));
                                button1.setText(str1);


                            }
                        });
                        editText4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText4.setText((String.valueOf(b1)));
                                button1.setText(str1);



                            }
                        });
                        Text5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text5.setText((String.valueOf(b1)));
                                button1.setText(str1);


                            }
                        });
                        Text6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text6.setText((String.valueOf(b1)));
                                button1.setText(str1);


                            }
                        });
                        Text7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text7.setText((String.valueOf(b1)));
                                button1.setText(str1);


                            }
                        });
                        Text8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text8.setText((String.valueOf(b1)));
                                button1.setText(str1);


                            }
                        });
                        Text9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text9.setText((String.valueOf(b1)));
                                button1.setText(str1);


                            }
                        });
                        Text10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text10.setText((String.valueOf(b1)));
                                button1.setText(str1);


                            }
                        });


                    }
                });
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                        Text1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text1.setText((String.valueOf(b2)));
                                button2.setText(str1);

                            }
                        });
                        editText2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText2.setText((String.valueOf(b2)));
                                button2.setText(str1);


                            }
                        });
                        Text3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text3.setText((String.valueOf(b2)));
                                button2.setText(str1);


                            }
                        });
                        editText4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText4.setText((String.valueOf(b2)));
                                button2.setText(str1);



                            }
                        });
                        Text5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text5.setText((String.valueOf(b2)));
                                button2.setText(str1);


                            }
                        });
                        Text6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text6.setText((String.valueOf(b2)));
                                button2.setText(str1);


                            }
                        });
                        Text7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text7.setText((String.valueOf(b2)));
                                button2.setText(str1);


                            }
                        });
                        Text8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text8.setText((String.valueOf(b2)));
                                button2.setText(str1);


                            }
                        });
                        Text9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text9.setText((String.valueOf(b2)));
                                button2.setText(str1);


                            }
                        });
                        Text10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text10.setText((String.valueOf(b2)));
                                button2.setText(str1);


                            }
                        });

                    }
                });
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                        Text1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text1.setText((String.valueOf(b3)));
                                button3.setText(str1);

                            }
                        });
                        editText2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText2.setText((String.valueOf(b3)));
                                button3.setText(str1);


                            }
                        });
                        Text3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text3.setText((String.valueOf(b3)));
                                button3.setText(str1);


                            }
                        });
                        editText4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText4.setText((String.valueOf(b3)));
                                button3.setText(str1);



                            }
                        });
                        Text5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text5.setText((String.valueOf(b3)));
                                button3.setText(str1);


                            }
                        });
                        Text6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text6.setText((String.valueOf(b3)));
                                button3.setText(str1);


                            }
                        });
                        Text7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text7.setText((String.valueOf(b3)));
                                button3.setText(str1);


                            }
                        });
                        Text8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text8.setText((String.valueOf(b3)));
                                button3.setText(str1);


                            }
                        });
                        Text9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text9.setText((String.valueOf(b3)));
                                button3.setText(str1);


                            }
                        });
                        Text10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text10.setText((String.valueOf(b3)));
                                button3.setText(str1);


                            }
                        });


                    }
                });
                button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                        Text1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text1.setText((String.valueOf(b4)));
                                button4.setText(str1);

                            }
                        });
                        editText2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText2.setText((String.valueOf(b4)));
                                button4.setText(str1);


                            }
                        });
                        Text3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text3.setText((String.valueOf(b4)));
                                button4.setText(str1);


                            }
                        });
                        editText4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText4.setText((String.valueOf(b4)));
                                button4.setText(str1);



                            }
                        });
                        Text5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text5.setText((String.valueOf(b4)));
                                button4.setText(str1);


                            }
                        });
                        Text6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text6.setText((String.valueOf(b4)));
                                button4.setText(str1);


                            }
                        });
                        Text7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text7.setText((String.valueOf(b4)));
                                button4.setText(str1);


                            }
                        });
                        Text8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text8.setText((String.valueOf(b4)));
                                button4.setText(str1);


                            }
                        });
                        Text9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text9.setText((String.valueOf(b4)));
                                button4.setText(str1);


                            }
                        });
                        Text10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text10.setText((String.valueOf(b4)));
                                button4.setText(str1);


                            }
                        });


                    }
                });
                button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                        Text1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text1.setText((String.valueOf(b5)));
                                button5.setText(str1);

                            }
                        });
                        editText2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText2.setText((String.valueOf(b5)));
                                button5.setText(str1);


                            }
                        });
                        Text3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text3.setText((String.valueOf(b5)));
                                button5.setText(str1);


                            }
                        });
                        editText4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText4.setText((String.valueOf(b5)));
                                button5.setText(str1);



                            }
                        });
                        Text5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text5.setText((String.valueOf(b5)));
                                button5.setText(str1);


                            }
                        });
                        Text6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text6.setText((String.valueOf(b5)));
                                button5.setText(str1);


                            }
                        });
                        Text7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text7.setText((String.valueOf(b5)));
                                button5.setText(str1);


                            }
                        });
                        Text8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text8.setText((String.valueOf(b5)));
                                button5.setText(str1);


                            }
                        });
                        Text9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text9.setText((String.valueOf(b5)));
                                button5.setText(str1);


                            }
                        });
                        Text10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text10.setText((String.valueOf(b5)));
                                button5.setText(str1);


                            }
                        });

                    }
                });
                button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                        Text1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text1.setText((String.valueOf(b6)));
                                button6.setText(str1);

                            }
                        });
                        editText2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText2.setText((String.valueOf(b6)));
                                button6.setText(str1);


                            }
                        });
                        Text3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text3.setText((String.valueOf(b6)));
                                button6.setText(str1);


                            }
                        });
                        editText4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText4.setText((String.valueOf(b6)));
                                button6.setText(str1);



                            }
                        });
                        Text5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text5.setText((String.valueOf(b6)));
                                button6.setText(str1);


                            }
                        });
                        Text6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text6.setText((String.valueOf(b6)));
                                button6.setText(str1);


                            }
                        });
                        Text7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text7.setText((String.valueOf(b6)));
                                button6.setText(str1);


                            }
                        });
                        Text8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text8.setText((String.valueOf(b6)));
                                button6.setText(str1);


                            }
                        });
                        Text9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text9.setText((String.valueOf(b6)));
                                button6.setText(str1);


                            }
                        });
                        Text10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text10.setText((String.valueOf(b6)));
                                button6.setText(str1);


                            }
                        });
                        button7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                                Text1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Text1.setText((String.valueOf(b7)));
                                        button7.setText(str1);

                                    }
                                });
                                editText2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        editText2.setText((String.valueOf(b7)));
                                        button7.setText(str1);


                                    }
                                });
                                Text3.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Text3.setText((String.valueOf(b7)));
                                        button7.setText(str1);


                                    }
                                });
                                editText4.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        editText4.setText((String.valueOf(b7)));
                                        button7.setText(str1);



                                    }
                                });
                                Text5.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Text5.setText((String.valueOf(b7)));
                                        button7.setText(str1);


                                    }
                                });
                                Text6.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Text6.setText((String.valueOf(b7)));
                                        button7.setText(str1);


                                    }
                                });
                                Text7.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Text7.setText((String.valueOf(b7)));
                                        button7.setText(str1);


                                    }
                                });
                                Text8.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Text8.setText((String.valueOf(b7)));
                                        button7.setText(str1);


                                    }
                                });
                                Text9.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Text9.setText((String.valueOf(b7)));
                                        button7.setText(str1);


                                    }
                                });
                                Text10.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        Text10.setText((String.valueOf(b7)));
                                        button7.setText(str1);


                                    }
                                });

                            }
                        });


                    }
                });
                button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                        Text1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text1.setText((String.valueOf(b8)));
                                button8.setText(str1);

                            }
                        });
                        editText2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText2.setText((String.valueOf(b8)));
                                button8.setText(str1);


                            }
                        });
                        Text3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text3.setText((String.valueOf(b8)));
                                button8.setText(str1);


                            }
                        });
                        editText4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText4.setText((String.valueOf(b8)));
                                button8.setText(str1);



                            }
                        });
                        Text5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text5.setText((String.valueOf(b8)));
                                button8.setText(str1);


                            }
                        });
                        Text6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text6.setText((String.valueOf(b8)));
                                button8.setText(str1);


                            }
                        });
                        Text7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text7.setText((String.valueOf(b8)));
                                button8.setText(str1);


                            }
                        });
                        Text8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text8.setText((String.valueOf(b8)));
                                button8.setText(str1);


                            }
                        });
                        Text9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text9.setText((String.valueOf(b8)));
                                button8.setText(str1);


                            }
                        });
                        Text10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text10.setText((String.valueOf(b8)));
                                button8.setText(str1);


                            }
                        });

                    }
                });
                button9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();
                        Text1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text1.setText((String.valueOf(b9)));
                                button9.setText(str1);

                            }
                        });
                        editText2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText2.setText((String.valueOf(b9)));
                                button9.setText(str1);


                            }
                        });
                        Text3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text3.setText((String.valueOf(b9)));
                                button9.setText(str1);


                            }
                        });
                        editText4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText4.setText((String.valueOf(b9)));
                                button9.setText(str1);



                            }
                        });
                        Text5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text5.setText((String.valueOf(b9)));
                                button9.setText(str1);


                            }
                        });
                        Text6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text6.setText((String.valueOf(b9)));
                                button9.setText(str1);


                            }
                        });
                        Text7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text7.setText((String.valueOf(b9)));
                                button9.setText(str1);


                            }
                        });
                        Text8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text8.setText((String.valueOf(b9)));
                                button9.setText(str1);


                            }
                        });
                        Text9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text9.setText((String.valueOf(b9)));
                                button9.setText(str1);


                            }
                        });
                        Text10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text10.setText((String.valueOf(b9)));
                                button9.setText(str1);


                            }
                        });

                    }
                });
                button10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Click one of the blanks to insert the number in the button. ", Toast.LENGTH_SHORT).show();

                        Text1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text1.setText((String.valueOf(b10)));
                                button10.setText(str1);

                            }
                        });
                        editText2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText2.setText((String.valueOf(b10)));
                                button10.setText(str1);


                            }
                        });
                        Text3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text3.setText((String.valueOf(b10)));
                                button10.setText(str1);


                            }
                        });
                        editText4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                editText4.setText((String.valueOf(b10)));
                                button10.setText(str1);



                            }
                        });
                        Text5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text5.setText((String.valueOf(b10)));
                                button10.setText(str1);


                            }
                        });
                        Text6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text6.setText((String.valueOf(b10)));
                                button10.setText(str1);


                            }
                        });
                        Text7.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text7.setText((String.valueOf(b10)));
                                button10.setText(str1);


                            }
                        });
                        Text8.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text8.setText((String.valueOf(b10)));
                                button10.setText(str1);


                            }
                        });
                        Text9.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text9.setText((String.valueOf(b10)));
                                button10.setText(str1);


                            }
                        });
                        Text10.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Text10.setText((String.valueOf(b10)));
                                button10.setText(str1);


                            }
                        });

                    }
                });


            }
        });






        //txt1 = Text1.getText();
        int txt1 = Integer.valueOf(String.valueOf(Text1.getText()));
        // int txt1 = Integer.parseInt(Text1.getText().toString());
        int txt2 = Integer.valueOf(String.valueOf(editText2.getText()));
        int txt3 = Integer.valueOf(String.valueOf(Text3.getText()));
        int txt4 = Integer.valueOf(String.valueOf(editText4.getText()));
        int txt5 = Integer.valueOf(String.valueOf(Text5.getText()));
        int txt6 = Integer.valueOf(String.valueOf(Text6.getText()));
        int txt7 = Integer.valueOf(String.valueOf(Text7.getText()));
        int txt8 = Integer.valueOf(String.valueOf(Text8.getText()));
        int txt9 = Integer.valueOf(String.valueOf(Text9.getText()));
        int txt10 = Integer.valueOf(String.valueOf(Text10.getText()));


        boolean s1 = txt1 + txt2 == Integer.valueOf(String.valueOf(Textview3.getText()));
        boolean s2 = txt3-txt4 == Integer.valueOf(String.valueOf(Textview6.getText()));
        boolean s3 = txt5*txt6 == Integer.valueOf(String.valueOf(Textview9.getText()));
        boolean s4 = txt7/txt8 == Integer.valueOf(String.valueOf(Textview12.getText()));
        boolean s5 = txt9 + txt10 == Integer.valueOf(String.valueOf(Textview15.getText()));
        if (s1 && s2 && s3 && s4 && s5){
            score=score+1;
            life=3;


        }
        else{
            score=0;
            life=life - 1;
        }








    }
}


//}


//}



