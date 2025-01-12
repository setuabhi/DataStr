**Partitioning vs Sharding**

    While both partitioning and sharding involve dividing data, they differ in scope and implementation:

    Feature	        Partitioning	                                          Sharding
    Scope	        Divides data within a single database or server.	  Distributes data across multiple databases/servers.
    Goal	        Improve query performance and manageability locally.      Achieve scalability by handling large-scale traffic and data.
    Control	        Handled at the database level (internal).	          Requires application-level logic for routing queries to the correct shard(Server)
    Infrastructure	Operates within a single physical database or instance.   Involves multiple databases on separate servers.

**Horizontal Sharding**

    Concept:
        In horizontal sharding, the rows of a table are divided across multiple shards (servers). Each shard contains the same schema but different rows.

    How It Works:
        Each shard is responsible for a subset of the data, based on a sharding key.
        For example, a user database might be sharded by user_id, with users having IDs 1–1000 on one shard, 1001–2000 on another, and so on.

    Advantages:
        Scales well with increasing data size by spreading rows across servers.
        All shards maintain the same schema, simplifying application logic.
        Reduces the amount of data a single server must handle.
    Challenges:
        Uneven data distribution if the sharding key is not chosen carefully.
        Cross-shard queries can be complex and slow.
        Rebalancing shards when data grows unevenly can be challenging.

**Vertical Sharding**

    Concept:
       In vertical sharding, the columns of a table are divided across multiple shards. Each shard contains a subset of columns for the same rows and will have one common joining column
       How It Works:
       Data is split by functionality or access patterns. For example:
       Shard 1 contains user profile information (user_id, name, email).
       Shard 2 contains user activity data (user_id, login_count, last_login).

    Advantages:
       Useful for optimizing performance by grouping frequently accessed data together.
       Simplifies schema management for specialized use cases.
       Reduces data redundancy and improves query speed for specific use cases.

    Challenges:
       Requires careful design to avoid performance bottlenecks during joins.
       Increased complexity in application logic, as it must handle multiple shards.
       Schema changes can be more challenging to implement.

**Directory-Based Sharding**

    Concept:
       Directory-based sharding uses a lookup table (directory) to determine where a particular piece of data is stored in shard (Server)
       How It Works:
       The application or database queries the directory to find the shard containing the data.
       The directory maps keys (e.g., user IDs or order IDs) to specific shards. i.e. Directory will tell where user_id=10 will be found, db1 or db2 ...
    Advantages:
       Flexible and allows arbitrary sharding logic.
       Can easily handle changes, like adding or removing shards, without redistributing all data because distributing logic we can define in directory only
    Challenges:
       The directory can become a single point of failure or a performance bottleneck.
       Increased complexity in maintaining and updating the directory.
       Directory lookups add an extra layer of latency.