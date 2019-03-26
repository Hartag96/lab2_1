package edu.iis.mto.bsearch;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

public class BinarySearchTest {

    private BinarySearch binarySearch;

    @Test
    public void OneElementSequenceValueInSequence() {
        int [] seq = {1};
        int value = 1;

        SearchResult searchResult = binarySearch.search(value, seq);
        assertEquals(searchResult.isFound(), true);
    }

    @Test
    public void OneElementSequenceValueNotInSequence() {
        int [] seq = {1};
        int value = -1;

        SearchResult searchResult = binarySearch.search(value, seq);
        assertEquals(searchResult.isFound(), false);
    }

    @Test
    public void MultiElementSequenceValueFirstInSequence() {
        int [] seq = {1,2,3};
        int value = 1;

        SearchResult searchResult = binarySearch.search(value, seq);
        assertEquals(searchResult.isFound(), true);
        assertEquals(searchResult.getPosition(), 0);
    }

    @Test
    public void MultiElementSequenceValueLastInSequence() {
        int [] seq = {1,2,3};
        int value = 3;

        SearchResult searchResult = binarySearch.search(value, seq);
        assertEquals(searchResult.isFound(), true);
        assertEquals(searchResult.getPosition(), seq.length-1);
    }

    @Test
    public void MultiElementSequenceValueCenterInSequence() {
        int [] seq = {1,2,3};
        int value = 2;

        SearchResult searchResult = binarySearch.search(value, seq);
        assertEquals(searchResult.isFound(), true);
        assertEquals(searchResult.getPosition(), (seq.length - 1) / 2);
    }

    @Test
    public void MultiElementSequenceValueNotInSequence() {
        int [] seq = {1,2,3};
        int value = -1;

        SearchResult searchResult = binarySearch.search(value, seq);
        assertEquals(searchResult.isFound(), false);
        assertEquals(searchResult.getPosition(), -1);
    }
}
