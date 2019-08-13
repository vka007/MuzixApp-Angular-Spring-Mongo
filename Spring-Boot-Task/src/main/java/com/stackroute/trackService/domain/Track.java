package com.stackroute.trackService.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "track")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Track {

    @Id
    private String trackId;
    private String trackName;
    private String trackUrl;
    private String trackSinger;
    private String trackImageUrl;
    private String trackComment;

}
