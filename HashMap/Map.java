package HashMap;
import java.util.ArrayList;

public class Map<K,V> {
	
	ArrayList<MapNode<K,V>> bucket;
	int count=0;
	int numOfBuckets;
	
	public Map() {
		bucket=new ArrayList<MapNode<K,V>>();
		numOfBuckets=20;
		for(int i=0; i<numOfBuckets; i++) {
			bucket.add(null);
		}
	}
	private void reHash() {
		ArrayList<MapNode<K,V>> temp=bucket;
		bucket=new ArrayList<>();
		for(int i=0;i<2*numOfBuckets;i++) {
			bucket.add(null);
		}
		count=0;
		numOfBuckets=2*numOfBuckets;
		for(int i=0;i<temp.size();i++) {
			MapNode<K, V> head=temp.get(i);
			while(head!=null) {
				K key=head.key;
				V value=head.value;
				insert(key,value);
				head=head.next;
			}
		}
	
	}
	private int getBucketIndex(K key) {
		// hashing
		int hc=key.hashCode();
		int index=hc%numOfBuckets;
		return index;
	}
	public double loadFactor() {
		return (1.0*count)/numOfBuckets;
	}
	public void insert(K key, V value) {
		int bucketIndex= getBucketIndex(key);
		MapNode<K,V> head = bucket.get(bucketIndex);
		// Check if element is there or not
		// if its there update the value
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
			head=head.next;
		}
		// Element is not there, so insert at 0th position in LinkedList
		head=bucket.get(bucketIndex);
		MapNode<K,V> newNode=new MapNode<>(key, value);
		newNode.next=head;
		bucket.set(bucketIndex, newNode);
		count++;
		double loadFactor=(1.0*count)/numOfBuckets;
		if(loadFactor>=0.7) {
			reHash();
		}
	}
	public V getValue(K key) {
		int bucketIndex=getBucketIndex(key);
		MapNode<K,V> head=bucket.get(bucketIndex);
		while(head!=null) {
			if(head.key.equals(key))
				return head.value;
			head=head.next;
		}
		return null;
	}
	public void remove(K key) {
		int bucketIndex=getBucketIndex(key);
		MapNode<K,V> head=bucket.get(bucketIndex);
		if(head.key.equals(key)) {
			head=head.next;
			bucket.set(bucketIndex, head);
			count--;
		}else {
			while(head!=null) {
				if(head.next.equals(key)) {
					head.next=head.next.next;
					count--;
					return;
				}
				head=head.next;
			}
		}
		
	}
	public int size() {
		return count;
	}

}
