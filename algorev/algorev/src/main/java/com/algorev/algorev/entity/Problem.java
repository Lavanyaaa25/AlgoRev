package com.algorev.algorev.entity;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "problems")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Problem {

    @Id
    private ObjectId id;

    @Indexed(unique = true )
    @NonNull
    private String name;

    private String link;

    private String approach;

}

