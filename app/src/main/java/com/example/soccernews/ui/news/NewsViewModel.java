package com.example.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.soccernews.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> mnews;

    public NewsViewModel() {
        mnews = new MutableLiveData<>();

        //TODO remover mock de notícias
        List<News> news = new ArrayList();
        news.add(new News("Flamengo goleia Tolima","Flamengo vence jogo dentro de casa por 7x1"));
        news.add(new News("Corinthians vence nos penaltis e se classifica","Corinthinas ganhou do Boca juniors nos penaltis"));
        news.add(new News("Galo passa por Emelec","O Atletico Mineiro vence por 1x0 o Emelec e se classifica para as quartas de final"));

        mnews.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return mnews;
    }
}