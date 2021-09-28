create USER "partya" WITH LOGIN PASSWORD 'docchain@2021';
create SCHEMA "partya_schema"

-- allow the user to access the schema and create objects in that schema.
grant USAGE, create ON SCHEMA "partya_schema" TO "partya";

-- adding permissions for current tables in that schema and the tables created in the future.
grant select, insert, update, delete, REFERENCES ON ALL tables IN SCHEMA "partya_schema" TO "partya";
alter DEFAULT privileges IN SCHEMA "partya_schema" grant select, insert, update, delete, REFERENCES ON tables TO "partya";
grant USAGE, select ON ALL sequences IN SCHEMA "partya_schema" TO "partya";
alter DEFAULT privileges IN SCHEMA "partya_schema" grant USAGE, select ON sequences TO "partya";
alter role "partya" SET search_path = "partya_schema";


-- doing the same for market
create USER "partyb" WITH LOGIN PASSWORD 'docchain@2021';
create SCHEMA "partyb_schema"

-- allow the user to access the schema and create objects in that schema.
grant USAGE, create ON SCHEMA "partyb_schema" TO "partyb";

-- adding permissions for current tables in that schema and the tables created in the future.
grant select, insert, update, delete, REFERENCES ON ALL tables IN SCHEMA "partyb_schema" TO "partyb";
alter DEFAULT privileges IN SCHEMA "partyb_schema" grant select, insert, update, delete, REFERENCES ON tables TO "partyb";
grant USAGE, select ON ALL sequences IN SCHEMA "partyb_schema" TO "partyb";
alter DEFAULT privileges IN SCHEMA "partyb_schema" grant USAGE, select ON sequences TO "partyb";
alter role "partyb" SET search_path = "partyb_schema";

-- doing the same for market
create USER "partyc" WITH LOGIN PASSWORD 'docchain@2021';
create SCHEMA "partyc_schema"

-- allow the user to access the schema and create objects in that schema.
grant USAGE, create ON SCHEMA "partyc_schema" TO "partyc";

-- adding permissions for current tables in that schema and the tables created in the future.
grant select, insert, update, delete, REFERENCES ON ALL tables IN SCHEMA "partyc_schema" TO "partyc";
alter DEFAULT privileges IN SCHEMA "partyc_schema" grant select, insert, update, delete, REFERENCES ON tables TO "partyc";
grant USAGE, select ON ALL sequences IN SCHEMA "partyc_schema" TO "partyc";
alter DEFAULT privileges IN SCHEMA "partyc_schema" grant USAGE, select ON sequences TO "partyc";
alter role "partyc" SET search_path = "partyc_schema";