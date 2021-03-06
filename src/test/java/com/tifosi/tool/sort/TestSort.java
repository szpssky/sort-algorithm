package com.tifosi.tool.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by szp on 16/7/10.
 */
public class TestSort {
    private  Integer array[] = new Integer[100];
    public  void createArray(){
        for(int i=0;i<array.length;i++){
            array[i] = new Random().nextInt(200);
        }

    }
    @Before
    public  void init(){
        createArray();
    }

    @Test
    public void testQuickSort() {
        Integer[] tmp = array.clone();
        Sort<Integer> quickSort = new QuickSort<Integer>(array);
        quickSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array, tmp);

    }
    @Test
    public void testMergeSort(){
        Integer[] tmp = array.clone();
        Sort<Integer> mergeSort = new MergeSort<Integer>(array);
        mergeSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array, tmp);

    }
    @Test
    public void testBubbleSort(){
        Integer[] tmp = array.clone();
        Sort<Integer> bubbleSort = new BubbleSort<Integer>(array);
        bubbleSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array, tmp);
    }
    @Test
    public void testSelectionSort(){
        Integer[] tmp = array.clone();
        Sort<Integer> selectionSort = new SelectionSort<Integer>(array);
        selectionSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array, tmp);
    }
    @Test
    public void testInsertionSort(){
        Integer[] tmp = array.clone();
        Sort<Integer> insertionSort = new InsertionSort<Integer>(array);
        insertionSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array,tmp);
    }
    @Test
    public void testShellSort(){
        Integer[] tmp = array.clone();
        Sort<Integer> shellSort = new ShellSort<Integer>(array);
        shellSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array,tmp);
    }
    @Test
    public void testHeapSort(){
        Integer[] tmp = array.clone();
        Sort<Integer> heapSort = new HeapSort<Integer>(array);
        heapSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array,tmp);
    }
    @Test
    public void testCocktailSort(){
        Integer[] tmp = array.clone();
        Sort<Integer> cocktailSort = new CocktailSort<Integer>(array);
        cocktailSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array,tmp);
    }
    @Test
    public void testGnomeSort(){
        Integer[] tmp = array.clone();
        Sort<Integer> gnomeSort = new GnomeSort<Integer>(array);
        gnomeSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array,tmp);
    }
    @Test
    public void testCombSort(){
        Integer[] tmp = array.clone();
        Sort<Integer> combSort = new CombSort<Integer>(array);
        combSort.sort();
        Arrays.sort(tmp);
        assertArrayEquals(array,tmp);
    }
}
