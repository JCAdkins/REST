package com.cooksys.twitter.mappers;

import com.cooksys.twitter.dtos.TweetRequestDto;
import com.cooksys.twitter.dtos.TweetResponseDto;
import com.cooksys.twitter.entities.Hashtag;
import com.cooksys.twitter.entities.Tweet;
import com.cooksys.twitter.entities.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-02T17:45:02-0700",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class TweetMapperImpl implements TweetMapper {

    @Override
    public TweetResponseDto entityToDto(Tweet entity) {
        if ( entity == null ) {
            return null;
        }

        TweetResponseDto tweetResponseDto = new TweetResponseDto();

        tweetResponseDto.setId( entity.getId() );
        tweetResponseDto.setAuthor( entity.getAuthor() );
        tweetResponseDto.setDeleted( entity.isDeleted() );
        tweetResponseDto.setPosted( entity.getPosted() );
        tweetResponseDto.setContent( entity.getContent() );
        tweetResponseDto.setInReplyTo( entity.getInReplyTo() );
        tweetResponseDto.setRepostOf( entity.getRepostOf() );
        List<Tweet> list = entity.getReposts();
        if ( list != null ) {
            tweetResponseDto.setReposts( new ArrayList<Tweet>( list ) );
        }
        List<Tweet> list1 = entity.getReplies();
        if ( list1 != null ) {
            tweetResponseDto.setReplies( new ArrayList<Tweet>( list1 ) );
        }
        List<User> list2 = entity.getLikes();
        if ( list2 != null ) {
            tweetResponseDto.setLikes( new ArrayList<User>( list2 ) );
        }
        List<Hashtag> list3 = entity.getHashtags();
        if ( list3 != null ) {
            tweetResponseDto.setHashtags( new ArrayList<Hashtag>( list3 ) );
        }
        List<User> list4 = entity.getUserMentioned();
        if ( list4 != null ) {
            tweetResponseDto.setUserMentioned( new ArrayList<User>( list4 ) );
        }

        return tweetResponseDto;
    }

    @Override
    public List<TweetResponseDto> entitiesToDtos(List<Tweet> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TweetResponseDto> list = new ArrayList<TweetResponseDto>( entities.size() );
        for ( Tweet tweet : entities ) {
            list.add( entityToDto( tweet ) );
        }

        return list;
    }

    @Override
    public Tweet requestDtoToEntity(TweetRequestDto questionRequestDto) {
        if ( questionRequestDto == null ) {
            return null;
        }

        Tweet tweet = new Tweet();

        tweet.setAuthor( questionRequestDto.getAuthor() );
        tweet.setPosted( questionRequestDto.getPosted() );
        if ( questionRequestDto.getDeleted() != null ) {
            tweet.setDeleted( questionRequestDto.getDeleted() );
        }
        tweet.setContent( questionRequestDto.getContent() );
        tweet.setInReplyTo( questionRequestDto.getInReplyTo() );
        tweet.setRepostOf( questionRequestDto.getRepostOf() );
        List<Tweet> list = questionRequestDto.getReposts();
        if ( list != null ) {
            tweet.setReposts( new ArrayList<Tweet>( list ) );
        }
        List<Tweet> list1 = questionRequestDto.getReplies();
        if ( list1 != null ) {
            tweet.setReplies( new ArrayList<Tweet>( list1 ) );
        }
        List<User> list2 = questionRequestDto.getLikes();
        if ( list2 != null ) {
            tweet.setLikes( new ArrayList<User>( list2 ) );
        }
        List<Hashtag> list3 = questionRequestDto.getHashtags();
        if ( list3 != null ) {
            tweet.setHashtags( new ArrayList<Hashtag>( list3 ) );
        }
        List<User> list4 = questionRequestDto.getUserMentioned();
        if ( list4 != null ) {
            tweet.setUserMentioned( new ArrayList<User>( list4 ) );
        }

        return tweet;
    }

    @Override
    public Tweet responseDtoToEntity(TweetResponseDto questionResponseDto) {
        if ( questionResponseDto == null ) {
            return null;
        }

        Tweet tweet = new Tweet();

        tweet.setId( questionResponseDto.getId() );
        tweet.setAuthor( questionResponseDto.getAuthor() );
        tweet.setPosted( questionResponseDto.getPosted() );
        if ( questionResponseDto.getDeleted() != null ) {
            tweet.setDeleted( questionResponseDto.getDeleted() );
        }
        tweet.setContent( questionResponseDto.getContent() );
        tweet.setInReplyTo( questionResponseDto.getInReplyTo() );
        tweet.setRepostOf( questionResponseDto.getRepostOf() );
        List<Tweet> list = questionResponseDto.getReposts();
        if ( list != null ) {
            tweet.setReposts( new ArrayList<Tweet>( list ) );
        }
        List<Tweet> list1 = questionResponseDto.getReplies();
        if ( list1 != null ) {
            tweet.setReplies( new ArrayList<Tweet>( list1 ) );
        }
        List<User> list2 = questionResponseDto.getLikes();
        if ( list2 != null ) {
            tweet.setLikes( new ArrayList<User>( list2 ) );
        }
        List<Hashtag> list3 = questionResponseDto.getHashtags();
        if ( list3 != null ) {
            tweet.setHashtags( new ArrayList<Hashtag>( list3 ) );
        }
        List<User> list4 = questionResponseDto.getUserMentioned();
        if ( list4 != null ) {
            tweet.setUserMentioned( new ArrayList<User>( list4 ) );
        }

        return tweet;
    }

    @Override
    public TweetRequestDto entityToRequestDto(Tweet tweet) {
        if ( tweet == null ) {
            return null;
        }

        TweetRequestDto tweetRequestDto = new TweetRequestDto();

        tweetRequestDto.setAuthor( tweet.getAuthor() );
        tweetRequestDto.setPosted( tweet.getPosted() );
        tweetRequestDto.setDeleted( tweet.isDeleted() );
        tweetRequestDto.setContent( tweet.getContent() );
        tweetRequestDto.setInReplyTo( tweet.getInReplyTo() );
        tweetRequestDto.setRepostOf( tweet.getRepostOf() );
        List<Tweet> list = tweet.getReposts();
        if ( list != null ) {
            tweetRequestDto.setReposts( new ArrayList<Tweet>( list ) );
        }
        List<Tweet> list1 = tweet.getReplies();
        if ( list1 != null ) {
            tweetRequestDto.setReplies( new ArrayList<Tweet>( list1 ) );
        }
        List<User> list2 = tweet.getLikes();
        if ( list2 != null ) {
            tweetRequestDto.setLikes( new ArrayList<User>( list2 ) );
        }
        List<Hashtag> list3 = tweet.getHashtags();
        if ( list3 != null ) {
            tweetRequestDto.setHashtags( new ArrayList<Hashtag>( list3 ) );
        }
        List<User> list4 = tweet.getUserMentioned();
        if ( list4 != null ) {
            tweetRequestDto.setUserMentioned( new ArrayList<User>( list4 ) );
        }

        return tweetRequestDto;
    }
}
