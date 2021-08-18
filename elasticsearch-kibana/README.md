# Spusteni:

    docker-compose up -d

# Funguje:

Elasticsearch: http://localhost:9200

Kibana: http://localhost:5601

Dejavu: http://localhost:1358/
Je nutné nastavit URL: http://localhost:9200 a index: kibana_sample_data_logs

# Vypnuti & smazani:

    docker-compose down

# Jenom vypnout (bez smazani): 

    docker-compose stop

# Vycisteni mista na disku:

    docker image prune --all
    docker volume prune
    docker system prune
