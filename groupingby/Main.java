package aco.groupingby;

import java.util.*;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class Main {

    List<BlogPost> posts = Arrays.asList();

    Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream().collect(groupingBy(BlogPost::getType));

    Map<BlogPostType, Set<BlogPost>> postsPerType2 = posts.stream()
            .collect(groupingBy(BlogPost::getType, toSet()));

    Map<String, Map<BlogPostType, List<BlogPost>>> map = posts.stream()
            .collect(groupingBy(BlogPost::getAuthor, groupingBy(BlogPost::getType)));

    Map<BlogPostType, Double> averageLikesPerType = posts.stream()
            .collect(groupingBy(BlogPost::getType, averagingInt(BlogPost::getLikes)));

    Map<BlogPostType, Integer> likesPerType = posts.stream()
            .collect(groupingBy(BlogPost::getType, summingInt(BlogPost::getLikes)));

    Map<BlogPostType, Optional<BlogPost>> maxLikesPerPostType = posts.stream()
            .collect(groupingBy(BlogPost::getType,
                    maxBy(comparingInt(BlogPost::getLikes))));

    Map<BlogPostType, IntSummaryStatistics> likeStatisticsPerType = posts.stream()
            .collect(groupingBy(BlogPost::getType,
                    summarizingInt(BlogPost::getLikes)));

    Map<BlogPostType, String> postsPerType1 = posts.stream()
            .collect(groupingBy(BlogPost::getType,
                    mapping(BlogPost::getTitle, joining(", ", "Post titles: [", "]"))));

    EnumMap<BlogPostType, List<BlogPost>> postsPerType3 = posts.stream()
            .collect(groupingBy(BlogPost::getType,
                    () -> new EnumMap<>(BlogPostType.class), toList()));

    Map<Tuple, List<BlogPost>> postsPerTypeAndAuthor = posts.stream()
            .collect(groupingBy(post -> new Tuple(post.getType(), post.getAuthor())));


    Map<BlogPost.AuthPostTypesLikes, List<BlogPost>> postsPerTypeAndAuthor1 = posts.stream()
            .collect(groupingBy(post -> new BlogPost.AuthPostTypesLikes(post.getAuthor(), post.getType(),
                    post.getLikes())));

    Map<String, BlogPost.PostCountTitlesLikesStats> postsPerAuthor = posts.stream()
            .collect(groupingBy(BlogPost::getAuthor, collectingAndThen(toList(), list -> {
                long count = list.stream()
                        .map(BlogPost::getTitle).count();
                String titles = list.stream()
                        .map(BlogPost::getTitle)
                        .collect(joining(" : "));
                IntSummaryStatistics summary = list.stream()
                        .collect(summarizingInt(BlogPost::getLikes));
                return new BlogPost.PostCountTitlesLikesStats(count, titles, summary);
            })));
}
