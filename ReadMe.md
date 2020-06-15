# Assignment 1

## Experiment Task Group 01 - 1990.txt

Parameters:

1. Number of Reducers 1, Intermediate Compression off, Combiner off
2. Number of Reducers 2, Intermediate Compression off, Combiner off
3. Number of Reducers 4, Intermediate Compression off, Combiner off
4. Number of Reducers 8, Intermediate Compression off, Combiner off

![*Group 01_1990*](/itmd-521/Week-09/Images/Exp1_1990.PNG "Group1_1990")


**Conclusion:**

From the execution data of the Group 1 experiments, it is evident that for the small dataset of 1990.txt that as the number of reducers are increased, the time taken to complete the job has been reduced suggesting a direct relationship between them(parallelism). This is due to the fact that with greater number of reducers we are using parallelism to perform of the job of finding the max temperature in the given dataset, as is also evident from the textbook page 217 in the 'Choosing the number of Reducers' section.
It is also evident with number of reducers set to 4, that instead of getting a reduced time we got an increase, this might be due to  the small size of data to each reducer along with increased overhead to manage the 4 reducers and get the outputs as mentioned in the 2nd drawback on page 241.

---

## Experiment Task Group 02 - 1990.txt

Parameters:

1. Number of Reducers 1, Intermediate Compression On (Snappy), Combiner off
2. Number of Reducers 2, Intermediate Compression On (Snappy), Combiner off
3. Number of Reducers 4, Intermediate Compression On (Snappy), Combiner off
4. Number of Reducers 8, Intermediate Compression On (Snappy), Combiner off

![*Group 02_1990*](/itmd-521/Week-09/Images/Exp2_1990.PNG "Group2_1990")

**Conclusion**

We know for a fact that Intermediate compression will improve the performance as lesser data would be worked on as well as transmitted, with Snappy being a fast compressor (processing wise not memory wise) as mentioned in book pages 108,101.
The execution data from this Group of experiments tells us how powerful the Snappy compression technique is, when we compare the timings with Group 1, we can see that we have had a average increase in performance by 29 seconds (approximately 30% increase).
When we compare the results in the Group 2, with respect to different number of reducers we can see an increasing trend, which I highly suspect is due to the overhead effect as mentioned in page 241. What this means, is that in case of small dataset(like 1990), by using Snappy compression the performance does improves, but it doesn't necessarily increase with as number of reducers increase.

---

## Experiment Task Group 03 - 1990.txt

Parameters:

1. Number of Reducers 1, Intermediate Compression On (Snappy), Combiner on
2. Number of Reducers 2, Intermediate Compression On (Snappy), Combiner on
3. Number of Reducers 4, Intermediate Compression On (Snappy), Combiner on
4. Number of Reducers 8, Intermediate Compression On (Snappy), Combiner on

![*Group 03_1990*](/itmd-521/Week-09/Images/Exp3_1990.PNG "Group3_1990")

**Conclusion**

Since Combiner functions are optimizing the data being send from each Mapper, they are essentially cutting down the data to be worked with, thus reducing the work needed to be done. So as such, using by its property of optimization, we would expect better performance when using Combiner. (Page 34 of textbook)
The same is seen in the results of Group 3, where we are using Snappy compression and Combiner functions, the job timings have reduced by approx. 50% when compared to results from Group 2 when using only Snappy compression. 
The trend seen within Group 3 results is that with increased number of reducers, job completion timings is also increased, suggesting degrading or stagnant performance(2-3 secs difference is not much) with increased reducers.

---

## Experiment Task Group 04 - 1990.txt

Parameters:

1. Number of Reducers 1, Intermediate Compression On (Gzip), Combiner off
2. Number of Reducers 2, Intermediate Compression On, (Gzip) Combiner off
3. Number of Reducers 4, Intermediate Compression On, (Gzip) Combiner off
4. Number of Reducers 8, Intermediate Compression On, (Gzip) Combiner off

![*Group 04_1990*](/itmd-521/Week-09/Images/Exp4_1990.PNG "Group4_1990")

**Conclusion**

As mentionoed in Chapter 5: Hadoop I/O, page 106 of the Hadoop definitive text, althoough Gzip having better compression ratio, it not supporting splitting leads to longer time to run, as is evident when comparing the results of Snappy compression in Group 2.
So, essentially, with compression being on,we would have improved performance than when run without compression on, as is seen when  comparing results of this Group 4 with Group 1 results.
In our current Group 4, the trend we see amongst it results is that with increased number of reducers the performance degrades, this would again be related to the small dataset of 1990.txt and overhead of managing the said number of reducers as mentioned on page 241.
The expected outcome would in case where data is sufficiently large would be that increasing the number of reducers will improve performance and give us lower job completion times.

---

## Experiment Task Group 05 - 1990.txt

Parameters:

1. Number of Reducers 1, Intermediate Compression On (Gzip), Combiner on
2. Number of Reducers 2, Intermediate Compression On, (Gzip) Combiner on
3. Number of Reducers 4, Intermediate Compression On, (Gzip) Combiner on
4. Number of Reducers 8, Intermediate Compression On, (Gzip) Combiner on

![*Group 05_1990*](/itmd-521/Week-09/Images/Exp5_1990.PNG "Group5_1990")


**Conclusion**


Similar to conclusion in Group 3, here to we see the increased performance when compared to results of Group 4, to the tune of gaining 50% improved times. Also within Group 5 we see the almost stagnant improvement in performance with increased number of reducers, similar to Group 3.  

---

## Experiment Task Group 01 - 80.txt

Parameters:

1. Number of Reducers 1, Intermediate Compression off, Combiner off
2. Number of Reducers 2, Intermediate Compression off, Combiner off
3. Number of Reducers 4, Intermediate Compression off, Combiner off
4. Number of Reducers 8, Intermediate Compression off, Combiner off

![*Group 01_80*](/itmd-521/Week-09/Images/Group1_80.PNG "Group1_80")


**Conclusion:**

Since 80.txt is a large dataset hence the issues seen in the results of 1990.txt, would mostly be eliminated or have reduced effect on the results of this dataset.
Similar to the points mentioned in conclusion of Group 1 for 1990.txt, here too we can see similar trend of lower time taken to complete job with increased number of reducers, due to parallelism effectively getting us more work done in shorter duration of time. 
Also we now don't see the spike in our graph as the one we saw with 4 reducers in the results from Group 1 of 1990, further strengthing the point that it was due to the fact that there wasn't enough data to showcase the improvement in speed and avoid the problem of reducers working too small jobs.

---

## Experiment Task Group 02 - 80.txt

Parameters:

1. Number of Reducers 1, Intermediate Compression On (Snappy), Combiner off
2. Number of Reducers 2, Intermediate Compression On (Snappy), Combiner off
3. Number of Reducers 4, Intermediate Compression On (Snappy), Combiner off
4. Number of Reducers 8, Intermediate Compression On (Snappy), Combiner off

![*Group 02_80*](/itmd-521/Week-09/Images/group2_80.PNG "Group2_80")

**Conclusion**

Here we can see that as number of reducers increase the performance improves, this is due to 2 reasons.
 - With increased number of reducers we have more parallelism and with the large dataset of 80, we have the reducers working simultaneously on the multiple partitions of data.
 - Using Snappy compression, the output from mapping tasks has been compressed thus, lower time to transmit data over the network and more time spend working on the data.
One key point to notice is that with reducer 1, all the data would be collated on that node and reduced upon so with Snappy, the compression ratio of the data being not as good as Gzip, it would still have more data coming in from multiple mappers, thus an increased time spend when compared with 1 reducer job with Group 4 using Gzip compression.

---

## Experiment Task Group 03 - 80.txt

Parameters:

1. Number of Reducers 1, Intermediate Compression On (Snappy), Combiner on
2. Number of Reducers 2, Intermediate Compression On (Snappy), Combiner on
3. Number of Reducers 4, Intermediate Compression On (Snappy), Combiner on
4. Number of Reducers 8, Intermediate Compression On (Snappy), Combiner on

![*Group 03_80*](/itmd-521/Week-09/Images/Group3_80.PNG "Group3_80")

**Conclusion**

Similar to results we have seen in the Group 3 of the 1990 dataset, we see a repeat performance in the results for this dataset.
Here too we see a drastic increased performance due to compression as well as combiner function, with almost 37% increase in performance when comparing jobs with 1 reducers from Group 2 with Group 3.
Another observation is that, with the increased number of reducers the difference in performance between the results of Group 3 to Group 2 is not that much (~ 27 secs difference) which means for sufficiently large data if we dont use combiner we would at the max have added 1-2 min more time to the job completion, considering we might not be able to implement Combiner logic for all scenarios.
In our current Group 03, we see the trend of increasing job completion times to number of reducers, suggesting that there is a direct relationship between the two.

---

## Experiment Task Group 04 - 80.txt

Parameters:

1. Number of Reducers 1, Intermediate Compression On (Gzip), Combiner off
2. Number of Reducers 2, Intermediate Compression On, (Gzip) Combiner off
3. Number of Reducers 4, Intermediate Compression On, (Gzip) Combiner off
4. Number of Reducers 8, Intermediate Compression On, (Gzip) Combiner off

![*Group 04_80*](/itmd-521/Week-09/Images/Group4_80.PNG "Group4_80")

**Conclusion**

Similar to results in Group 2, adding compression to mapper outputs helps in improving performance.
An interesting observation is that the time taken by 1 reducer with Gzip is actually better than with Snappy compression, and that would be attributed to that fact that Gzip has better compression ratio than Snappy, thus for 1 reducer the mapper outputs for Gzip are more compressed meaning less time send transmitting, thereby a gain in job completion times.
In context to Group 4 results by themselves, showcase a decreasing trend of job completion times with increasing reducers similar to Group 2 results and as expected when adding compression to mapper outputs.

---

## Experiment Task Group 05 - 80.txt

Parameters:

1. Number of Reducers 1, Intermediate Compression On (Gzip), Combiner on
2. Number of Reducers 2, Intermediate Compression On, (Gzip) Combiner on
3. Number of Reducers 4, Intermediate Compression On, (Gzip) Combiner on
4. Number of Reducers 8, Intermediate Compression On, (Gzip) Combiner on

![*Group 05_80*](/itmd-521/Week-09/Images/Group5_80.PNG "Group5_80")


Conclusion**

When we see the execution results for Group 5, we see a stagnant and degrading performance with increased number of reducers. Although interestingly we can see for 4 reducers, that the performance improved, and the only logical explanation that fits in this scenario, is that may be the combiner was run more times in this case, giving us a better perfromance. Since Hadoop never guarantees if it ran the combiner 0, 1 or more times as mentioned in book, hence I can only speculate on this.


---

## Experiment Task Group 01 - 80-90.txt

Parameters:

1. Number of Reducers 1, Intermediate Compression off, Combiner off
2. Number of Reducers 2, Intermediate Compression off, Combiner off
3. Number of Reducers 4, Intermediate Compression off, Combiner off
4. Number of Reducers 8, Intermediate Compression off, Combiner off

![*Group 01_80-90*](/itmd-521/Week-09/Images/Group1_80-90.PNG "Group1_80-90")


**Conclusion:**

Similar to results we have seen for Group 1 from datasets 1990 and 80, here too we have a trend of decreasing job completion times to increased number of reducers (attributed to parallelism giving us better timings)
The increased job timings we see for reducers = 2 and 8, than their predecessors, might be attributted to the fact that the 80-90 being a very large dataset, the results we have would have been skewed by other students running their jobs and low resource availability would have lead to increased time.


---

## Experiment Task Group 02 - 80-90.txt

Parameters:

1. Number of Reducers 1, Intermediate Compression On (Snappy), Combiner off
2. Number of Reducers 2, Intermediate Compression On (Snappy), Combiner off
3. Number of Reducers 4, Intermediate Compression On (Snappy), Combiner off
4. Number of Reducers 8, Intermediate Compression On (Snappy), Combiner off

![*Group 02_80-90*](/itmd-521/Week-09/Images/Group2_80-90.PNG "Group2_80-90")

**Conclusion**

Here too we see the same results as in Group 2 of datasets 1990 and 80, which is that we have a reduced job completion times to the increase in number of reducers.
The reasons for the improvements are same as mentioned in the conlusion for Group 2 of 80 dataset.

---

## Experiment Task Group 03 - 80-90.txt

Parameters:

1. Number of Reducers 1, Intermediate Compression On (Snappy), Combiner on
2. Number of Reducers 2, Intermediate Compression On (Snappy), Combiner on
3. Number of Reducers 4, Intermediate Compression On (Snappy), Combiner on
4. Number of Reducers 8, Intermediate Compression On (Snappy), Combiner on

![*Group 03_80-90*](/itmd-521/Week-09/Images/Group3_80-90.PNG "Group3_80-90")

**Conclusion**

The execution results of Group 3 showcase an increasing job completion time, with increasing number of reducers which is consistent with the results of Group 3 for all the other datasets.
Here too we see an improvement in timings when compared to results of Group 2, to the tune of almost 40% when comparing jobs with 1 reducers.
Another observation is that, with the increased number of reducers the difference in performance between the results of Group 3 to Group 2 is not that much (~ 27 secs difference) which means for sufficiently large data if we dont use combiner we would at the max have added 1-2 min more time to the job completion, considering we might not be able to implement Combiner logic for all scenarios.

---

## Experiment Task Group 04 - 80-90.txt

Parameters:

1. Number of Reducers 1, Intermediate Compression On (Gzip), Combiner off
2. Number of Reducers 2, Intermediate Compression On, (Gzip) Combiner off
3. Number of Reducers 4, Intermediate Compression On, (Gzip) Combiner off
4. Number of Reducers 8, Intermediate Compression On, (Gzip) Combiner off

![*Group 04_80-90*](/itmd-521/Week-09/Images/Group4_80-90.PNG "Group4_80-90")

**Conclusion**

The results of this group, showcase that we have a increasing trend in job completion times with increasing number of reducers, which is a complete reversal from the results of Group 4 for 80 dataset.
This might be due to the below 2 reasons:
 - Since 80-90 is a very large dataset, so processing this job would require large number of resources from the Hadoop cluster. In our case, since by the time I executed this job, many other students were also submitting jobs. Hence due to competing between jobs, resources would be low, which would have skewed the result.
 - Also it might be the case that since Gzip is compartively slower hence the time taken to compress the large amount of data output by each mapper, would have contributed to the overall reducing the performance and elevating the job completion times.
 
 Althouh I can say for certain which factors was the culprit, I can say that both of them contributed to a certain extent.

---

## Experiment Task Group 05 - 80-90.txt

Parameters:

1. Number of Reducers 1, Intermediate Compression On (Gzip), Combiner on
2. Number of Reducers 2, Intermediate Compression On, (Gzip) Combiner on
3. Number of Reducers 4, Intermediate Compression On, (Gzip) Combiner on
4. Number of Reducers 8, Intermediate Compression On, (Gzip) Combiner on

![*Group 05_80-90*](/itmd-521/Week-09/Images/Group5_80-90.PNG "Group5_80-90")


**Conclusion**

Here too we see a repeat of the execution results from Group 3, as although we have increasing job completion times with increasing number of reducers, with reducers =4 giving us a slightly optimized timing.
Similar to the explanation I gave in Group 5 for 80 dataset, it seems the combiner was run more times in this case as that is the most logical explanation here.

---

### Task Group 01 Analysis

![*Group 01*](/itmd-521/Week-09/Images/Group1.PNG "Group1")

Analyze and explain the execution time results accross per task group accross the three datasets. With graphs.

As seen in the graph shown above, the trend running across the three datasets is that with increased number of reducers we have increased parallelism, thereby giving us reduced job completion times and increased performance.
With the exception of the spike in the results for data 80-90 for reducers 2 and 8, which can be attributted to low resource avalilabiltiy due to the multiple students running their jobs, all the data points to reduced timings with increased number of reducers.
Here although the file size has increased, the trend mentioned above is valid.

### Task Group 02 Analysis

![*Group 02*](/itmd-521/Week-09/Images/Group2.PNG "Group2")

Analyze and explain the execution time results accross per task group accross the three datasets.With graphs.

In this group, we have mapper output getting compressed by Snappy which we know is a fast compressor(as stated in page 106 of textbook) thus setting the stage for improved performance.
When we look at the graph shown above, the trend of reduced time for increasing reducers is clearly visible across all the 2 datasets of 80 and 80-90 and is as per expectation as mentioned in page 109 of using compression for mapper outputs.
Here although the trend is clearly visible in the 2 large datasets, the smaller dataset showcases almost same to increased times whihc is largely due to the issue that the reducers have too small jobs and large overheads thus ultimately making us lose job time in that.

### Task Group 03 Analysis

![*Group 03*](/itmd-521/Week-09/Images/Group3.PNG "Group3")

Analyze and explain the execution time results accross per task group accross the three datasets.With graphs.

In this group, along with compression we have also used combiner function which has in turn given us a improvement in performance to the tune of 50% when comparing with results for Group 2.
From the graph, it is also visible that by using the combination of these two gives almost the best performance even when using 1 reducer. Suggesting that if we have a case where we cant get much resources and we are forced to use fewer reducers, then by using the compression and combiner combination we will have most optimized timing even when using 1 reducer.
The trend visible across all the three dataset is that job completion time remains same or increases slightly with increasing number of reducers.

Here, too although the file size has increased the trend mentioned above is still valid.

### Task Group 04 Analysis

![*Group 04*](/itmd-521/Week-09/Images/Group4.PNG "Group4")

Analyze and explain the execution time results accross per task group accross the three datasets.With graphs.

In this group, we have mapper output getting compressed by Gzip which although is not as fast as Snappy but still does a decent job.
When we look at the graph shown above, the trend of reduced times for increasing reducers is not as clearly visible across all the  datasets and is only seen in 80 dataset.

The trend for datasets 1990 and 80-90 is that with increasing reducers we have increased times to job completion. For the smaller dataeset of 1990, it is largely due to the issue that the reducers have too small jobs and large overheads thus ultimately making us lose job time in that.
For large dataset it would be due to competing resources by other students running jobs on the cluster.


### Task Group 05 Analysis

![*Group 05*](/itmd-521/Week-09/Images/Group5.PNG "Group5")

Analyze and explain the execution time results accross per task group accross the three datasets. With graphs.

In this group, along with compression we have also used combiner function which has in turn given us a improvement in performance to the tune of 50% when comparing with results for Group 4.
From the graph, it is also visible that by using the combination of these two gives almost the best performance even when using 1 reducer. Suggesting that if we have a case where we cant get much resources and we are forced to use fewer reducers, then by using the compression and combiner combination we will have most optimized timing even when using 1 reducer.
The trend visible across all the three dataset is that job completion time remains same or increases slightly with increasing number of reducers.

Here, too although the file size has increased the trend mentioned above is still valid.


### Overall Task Execution Time Analysis

Summerize all finds and explain any trends and make a concluding recommendation and explain why you make that recommendation.

The key findings from all the experiments is that :
- Increasing the number of reducers help in improving the performance of the job
- Including mapper output compressions like Snappy and Gzip, also further help in tuning the performance of the job, although Snappy generally performs better than Gzip, there are cases in which Gzip out performs Snappy (larger datasets)
- Adding a combiner method along with the mapper output compression drastically improves your performance to the tune of 30-40%.
- When using combiner with 1 reducer we get the most optimized result, adding more reducers doesnt improve the result but in cases degrades performance.

My recommendation on fine tuning the performance of your Hadoop job would be as below:
For small datasets:
Use 1 reducer and enable mapper output compression and set it to Snappy.

Why?
If you look at the results, we can see that by just adding Snappy compression we have job completion time of under 1 second.
Also my reason to not include Combiner functionality for this is that although combiner helps in reducing time, there is extra time needed to code the operation according to the properties needed for it to be Combiner compatible. And for such small data not using it would at the max add 30 secs more time which in my opinon is justifiable trade-off
For using 1 reducer only is because the data is small, hence adding more reducers would actually degrade the performance due to overhead issues.

For large and very large datasets:
If operation being performed is meeting the requirements of Combiner functionality, then implement combiner functionality and use it along with 1 reducer and enable mapper output compression and set it to Gzip.
If not use 8 reducers and enable mapper output compression and set it to Gzip.

Why?
In large and very large datasets adding combiner functionality greatly improves job performance, as is seen in the graphs for group 3 and 5 above and since we have the best timings for when reducers are 1 and compression is set to Gzip for intermediate map output when using combiner.
If in case we dont have combiner functionality, as seen from the results of Group 2 and 4, using 8 reducers along with Gzip compression we have the best results as Gzip has better compression ratio and performs better with large and very large datasets.

### References
------
1. [Data Compression Performance in Hadoop](https://www.cloudera.com/documentation/enterprise/5-3-x/topics/admin_data_compression_performance.html#xd_583c10bfdbd326ba-7dae4aa6-147c30d0933--7af7__section_sgg_sdf_ns)







