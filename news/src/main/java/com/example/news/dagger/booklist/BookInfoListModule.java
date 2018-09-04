package com.example.news.dagger.booklist;

import com.example.commonlibrary.mvp.model.DefaultModel;
import com.example.news.adapter.BookInfoListAdapter;
import com.example.news.mvp.booklist.BookInfoListFragment;
import com.example.news.mvp.booklist.BookInfoListPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * 项目名称:    NewFastFrame
 * 创建人:        陈锦军
 * 创建时间:    2017/9/19      11:02
 * QQ:             1981367757
 */
@Module
public class BookInfoListModule {
    private BookInfoListFragment bookInfoListFragment;

    public BookInfoListModule(BookInfoListFragment bookInfoListFragment) {
        this.bookInfoListFragment = bookInfoListFragment;
    }

    @Provides
    public BookInfoListAdapter provideBookInfoListAdapter() {
        return new BookInfoListAdapter();
    }


    @Provides
    public BookInfoListPresenter provideBookInbfoListPresenter(DefaultModel defaultModel) {
        return new BookInfoListPresenter(bookInfoListFragment, defaultModel);
    }



}
