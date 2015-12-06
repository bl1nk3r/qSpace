package com.example.barnes.ummoqmasterdashboard.Dq;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by barnes on 11/29/15.
 */
public class ArrayAdapter <T> extends BaseAdapter
{
    private ArrayList<T> mItems;

    /**
     * Creates a new ArrayAdapter with an empty list.
     */
    public ArrayAdapter() {
        this(null);
    }

    /**
     * Creates a new ArrayAdapter with the specified list, or an empty list if
     * items == null.
     */
    public ArrayAdapter(List<T> items)
    {
        mItems = new ArrayList<T>();
        if (items != null)
        {
            mItems.addAll(items);
        }
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public T getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    /**
     * Appends the specified element to the end of the list.
     */
    public void add(T item)
    {
        mItems.add(item);
        notifyDataSetChanged();
    }

    /**
     * Inserts the specified element at the specified position in the list.
     */
    public void add(int position, T item)
    {
        mItems.add(position, item);
        notifyDataSetChanged();
    }

    /**
     * Appends all of the elements in the specified collection to the end of the
     * list, in the order that they are returned by the specified collection's
     * Iterator.
     */
    public void addAll(Collection<? extends T> items)
    {
        mItems.addAll(items);
        notifyDataSetChanged();
    }

    /**
     * Appends all of the elements to the end of the list, in the order that
     * they are specified.
     */
    public void addAll(T... items)
    {
        Collections.addAll(mItems, items);
        notifyDataSetChanged();
    }

    /**
     * Inserts all of the elements in the specified collection into the list,
     * starting at the specified position.
     */
    public void addAll(int position, Collection<? extends T> items)
    {
        mItems.addAll(position, items);
        notifyDataSetChanged();
    }

    /**
     * Inserts all of the elements into the list, starting at the specified
     * position.
     */
    public void addAll(int position, T... items)
    {
        for (int i = position; i < (items.length + position); i++) {
            mItems.add(i, items[i]);
        }
        notifyDataSetChanged();
    }

    /**
     * Removes all of the elements from the list.
     */
    public void clear()
    {
        mItems.clear();
        notifyDataSetChanged();
    }

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     */
    public void set(int position, T item)
    {
        mItems.set(position, item);
        notifyDataSetChanged();
    }

    /**
     * Removes the specified element from the list
     */
    public void remove(T item)
    {
        mItems.remove(item);
        notifyDataSetChanged();
    }

    /**
     * Removes the element at the specified position in the list
     */
    public void remove(int position)
    {
        if (position == 0)
        {
            mItems.remove(position);
            notifyDataSetChanged();
        }
    }

    /**
     * Removes all elements at the specified positions in the list
     */
    public void removePositions(Collection<Integer> positions)
    {
        ArrayList<Integer> positionsList = new ArrayList<Integer>(positions);
        Collections.sort(positionsList);
        Collections.reverse(positionsList);
        for (int position : positionsList)
        {
            mItems.remove(position);
        }
        notifyDataSetChanged();
    }

    /**
     * Removes all of the list's elements that are also contained in the
     * specified collection
     */
    public void removeAll(Collection<T> items)
    {
        mItems.removeAll(items);
        notifyDataSetChanged();
    }

    /**
     * Retains only the elements in the list that are contained in the specified
     * collection
     */
    public void retainAll(Collection<T> items)
    {
        mItems.retainAll(items);
        notifyDataSetChanged();
    }

    /**
     * Returns the position of the first occurrence of the specified element in
     * this list, or -1 if this list does not contain the element. More
     * formally, returns the lowest position <tt>i</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
     * or -1 if there is no such position.
     */
    public int indexOf(T item) {
        return mItems.indexOf(item);
    }
}
