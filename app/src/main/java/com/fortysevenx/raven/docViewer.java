package com.fortysevenx.raven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class docViewer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_viewer);

        PDFView pdfView = findViewById(R.id.pdf_view);

        pdfView.fromAsset( "Resume.pdf").load();
    }
}